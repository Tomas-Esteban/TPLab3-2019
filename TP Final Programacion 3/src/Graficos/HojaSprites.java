package Graficos;

import java.awt.image.BufferedImage;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase para ajustar las imagenes (sprites) de la hoja grafica a la interfaz grafica.
 * @param objeto hoja de sprites.
 *  
 */

public class HojaSprites {
    
    private BufferedImage hoja;
    
    public HojaSprites(BufferedImage hoja){
        this.hoja = hoja;
    }
    
    /**
     * metodo que se encarga de ajustar nuestras imagenes en pixeles a nuestra pantalla de 800x600px.
     * @param x
     * @param y
     * @param ancho
     * @param alto
     * @return nuestra hoja ajustada
     */
    public BufferedImage ajustar(int x, int y, int ancho, int alto){
        
        return hoja.getSubimage(x, y, ancho, alto);
    }
}
