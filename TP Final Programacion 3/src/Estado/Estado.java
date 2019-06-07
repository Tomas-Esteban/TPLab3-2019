/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;

import Pantallas.Juego;
import java.awt.Graphics;

/**
 *
 * @author Pardo
 */
public abstract class Estado {
    
    private static Estado estadoActual = null;
    
    public static void setEstado(Estado estado){
        estadoActual = estado;
    }
    
    public static Estado getEstado(){
        return estadoActual;
    }
    
    //
    protected Juego juego;
    
    public Estado(Juego juego){
        this.juego = juego;
    }
    
    
    public abstract void actualizar ();
    
    public abstract void renderizar(Graphics g);
}
