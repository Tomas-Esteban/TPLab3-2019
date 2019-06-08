/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase para cargar imagenes a la interfaz grafica.
 * 
 */

public class CargadorImagen {
    
    public static BufferedImage cargarImagen(String ruta){
        
        try {
            return ImageIO.read(CargadorImagen.class.getResource(ruta));
        } catch (IOException ex) {
            Logger.getLogger(CargadorImagen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
