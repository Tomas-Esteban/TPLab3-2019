/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Estado.Estado;
import Estado.EstadoJuego;
import Estado.EstadoMenu;
import Graficos.CargadorImagen;
import Graficos.HojaSprites;
import Graficos.Recurso;
import Pantallas.Pantalla;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pardo
 */
public class Juego implements Runnable {
    
    
    public Pantalla ventana;
    public int ancho, alto;
    String titulo;
    
    private boolean enEjecucion = false;
    private Thread hilo;
    
    private BufferStrategy bs;
    private Graphics g;
    
    //temporal
    private BufferedImage test;
    private HojaSprites hoja;
    
    //Estados
    private Estado estadoJuego;
    private Estado estadoMenu;
    
    public Juego(String titulo, int ancho, int alto){
        
        this.ancho = ancho;
        this.alto = alto;
        this.titulo = titulo;
      
        
    }
    
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
                renderizar();
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
          
          estadoJuego = new EstadoJuego(this);
          estadoMenu = new EstadoMenu(this);
          
          Estado.setEstado(estadoJuego);
        // test = CargadorImagen.cargarImagen("/recursos/texturas/bg.png");
         // hoja = new HojaSprites(test);
    }
    
    private void actualizar(){
        if(Estado.getEstado() != null)
            Estado.getEstado().actualizar();
    }
    
    private void renderizar(){
        
        bs = ventana.getCanvas().getBufferStrategy();
        
        if(bs == null){
            ventana.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //LIMPIAR PANTALLA
        g.clearRect(0, 0, ancho, alto);
        //dIBUJAR
        
        if(Estado.getEstado() != null)
            Estado.getEstado().renderizar(g);
        //g.drawImage(Recurso.cespedOscuro, 10, 10, null);

        //g.drawImage(test, 0, 0, null);
        //g.drawImage(hoja.ajustar(64, 64, 32, 32), 5, 5, null);
        
        //terminar de dibujar
        bs.show();
        g.dispose();
    }
    
    public synchronized void iniciar(){
        
        if(enEjecucion == true)
            return;
        
        enEjecucion = true;
        hilo = new Thread(this);
        hilo.start();
    }
    
    public synchronized void detener(){
        
        if(enEjecucion == false)
            return;
        try {
            hilo.join();
        } catch (InterruptedException e) {  //ex
            //Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
           e.printStackTrace();
        }
    }
    
}
