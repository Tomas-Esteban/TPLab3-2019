/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baldosas;

import Graficos.Recurso;
import java.awt.image.BufferedImage;

/**
 *
 * @author Pardo
 */
public class BaldosaMuralla extends Baldosa {

    public BaldosaMuralla(int id) {
        super(Recurso.muralla, id);
    }
    
    
    @Override
     public boolean esSolido(){
        return true;
    }
    
}
