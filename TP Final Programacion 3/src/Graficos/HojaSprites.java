/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.image.BufferedImage;

/**
 *
 * @author Pardo
 */
public class HojaSprites {
    
    private BufferedImage hoja;
    
    public HojaSprites(BufferedImage hoja){
        this.hoja = hoja;
    }
    
    public BufferedImage ajustar(int x, int y, int ancho, int alto){
        
        return hoja.getSubimage(x, y, ancho, alto);
    }
}
