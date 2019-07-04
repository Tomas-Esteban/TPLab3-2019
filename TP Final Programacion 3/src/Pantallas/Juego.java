package Pantallas;

import Graficos.Recurso;
import Interfaces.IAcciones;
import Pantallas.Pantalla;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferStrategy;
import Abstracta.Tablero;
import Abstracta.TableroJuego;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que se encarga de crear un objeto juego implementa la interfaz runnable  para utilizar hilos y IAcciones
 * con el fin de renderizar las imagenes y actualizar el juego.
 * @see <a href = "https://www.youtube.com/watch?v=qXhc4wbDaqU&t=186s" /> Hilos en Java </a>
 * @see Interfaces.IAcciones
 * 
 */

public class Juego implements Runnable, IAcciones{
	 
	private Pantalla ventana;
    private int ancho, alto;
    private String titulo;
    
    // Zombie
    private int movimientoPerroZombie = 800;
    
    private boolean enEjecucion = false;
    private Thread hilo;
    
    private BufferStrategy bs;
    private Graphics g;
    
    // Mouse
    public static Point mouse = new Point(0,0);
    
    // Estados
    private Tablero estadoJuego;
    private Tablero estadoMenu;
    
    public Juego(String titulo, int ancho, int alto){
        
        this.ancho = ancho;
        this.alto = alto;
        this.titulo = titulo;  
    }
    
    /**
     * se encarga de ejecutar a cuantos cuadros por segundos corre nuestra aplicacion.
     */
    public void run(){
        
        inicializar();
        
        int fps = 60;
        double tiempoPorActualizacion = 1000000000 / fps; //mide ne nanosecs
        double delta = 0;
        long ahora;
        long ultimoSegundo = System.nanoTime();
        long temporizador = 0;
        int actualizaciones = 0;
        
        while(enEjecucion == true){
            ahora = System.nanoTime();
            delta += (ahora - ultimoSegundo) / tiempoPorActualizacion;
            temporizador += ahora - ultimoSegundo;
            ultimoSegundo = ahora;
            
            if(delta >=1){
                actualizar();
                renderizar(g);
                actualizaciones ++;
                delta--;
                
            }
            
            if(temporizador >= 1000000000){
                System.out.println("Actualizaciones y cuadros: " + actualizaciones);
                actualizaciones = 0;
                temporizador = 0;
            }   
        }
    }
    
    
    private void inicializar(){
        
          ventana = new Pantalla(titulo, ancho, alto);
          Recurso.inicializar();
          
          estadoJuego = new TableroJuego(this);
                   
          Tablero.setEstado(estadoJuego);
    }
    
    @Override
    public void actualizar(){
    	if(movimientoPerroZombie > 100) {
    		movimientoPerroZombie -= 1;
    	}	
    }
    
    @Override
    public void renderizar(Graphics g){
        
        bs = ventana.getCanvas().getBufferStrategy();
        
        if(bs == null){
            ventana.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //LIMPIAR PANTALLA
        g.clearRect(0, 0, ancho, alto);
        //dIBUJAR
        
        if(Tablero.getEstado() != null)
            Tablero.getEstado().renderizar(g);
        g.drawImage(Recurso.perroZombie, movimientoPerroZombie,150 , null);
        
        //terminar de dibujar
        bs.show();
        g.dispose();
    }
    
    /**
     * Si la ejecucuon ya esta en ejecucion no te deja incializar el juego. 
     */
    public synchronized void iniciar(){
        
        if(enEjecucion == true)
            return;
        
        enEjecucion = true;
        hilo = new Thread(this);
        hilo.start();
        
        
    }
    /**
     * Si la ejecucion no esta en ejecucion crea un hilo de ejecucion. 
     */
    public synchronized void detener(){
        
        if(enEjecucion == false)
            return;
        try {
            hilo.join();
        } catch (InterruptedException e) { 
           e.printStackTrace();
        }
    }
    
    
   
}
