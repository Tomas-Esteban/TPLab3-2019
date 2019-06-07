package Pantallas;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Pardo
 */
public class Pantalla {
    
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
    
    private void crearVentana(){
        
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
        
    }
    
    public Canvas getCanvas(){
        
        return lienzo;
    }
    
}
