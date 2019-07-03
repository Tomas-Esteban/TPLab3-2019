package Pantallas;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;
import Graficos.AccionBoton;


/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase de la interfaz grafica Swing, pantalla principal.
 * <br> Tutorial sobre <strong> Swing en Eclipse </strong> </br>
 * @see <a href="https://www.youtube.com/playlist?list=PLMQ4k-hUWGNmQwP3u5HP894NnQQ9lGY_d" /> Swing Eclipse </a>
 * 
 */

public class Pantalla extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame ventana;
    private Canvas lienzo;
    
    private String titulo;
    private int ancho, alto;
    
    public Pantalla(String titulo, int ancho, int alto){
        
        this.titulo = titulo;
        this.ancho = ancho;
        this.alto = alto;
        
        crearVentana();
        
    }
    
    public void crearVentana(){
        
    	
    	
        ventana = new JFrame(titulo);
        ventana.setSize(ancho, alto);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
       
        
        
        lienzo = new Canvas();
        lienzo.setPreferredSize(new Dimension(ancho, alto));
        lienzo.setMaximumSize(new Dimension(ancho, alto));
        lienzo.setMinimumSize(new Dimension(ancho, alto));
        
        ventana.add(lienzo);
        ventana.pack();
        
  
        ventana.addMouseListener(new AccionBoton());
    	ventana.addMouseMotionListener(new AccionBoton());
    }
    
    public Canvas getCanvas(){
        return lienzo;
    }
    
}
