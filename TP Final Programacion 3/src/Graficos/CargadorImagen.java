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
 * @author Pardo
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
