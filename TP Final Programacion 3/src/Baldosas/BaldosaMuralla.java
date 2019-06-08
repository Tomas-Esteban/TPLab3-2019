/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baldosas;

import Graficos.Recurso;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que permite crear un objeto baldosa de en la cual se situa la muralla. (clase hija que extiende de Baldosa)
 * @see {@link Baldosa} 
 * 
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
