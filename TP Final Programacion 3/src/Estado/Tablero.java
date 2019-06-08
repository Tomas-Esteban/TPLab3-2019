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
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase abstract Tablero que permite al programador saber en que situacion se encuentra la partida. 
 * <br> Informacion sobre clases Abstractas </br>
 * @see {@link https://docs.google.com/presentation/d/1ukZdfxZRe_mO6xIykQPGs_bfKZjjB-H4Ynvq028qppA/edit#slide=id.p19}
 * @param objeto estatico que indica el estado actual de la partida.
 * 
 */
public abstract class Tablero {
    
    private static Tablero estadoActual = null;
    protected Juego juego;
    
    
    public Tablero(Juego juego){
        this.juego = juego;
    }
    
    public abstract void actualizar ();
    
    public abstract void renderizar(Graphics g);
    
    public static void setEstado(Tablero estado){
        estadoActual = estado;
    }
    public static Tablero getEstado(){
        return estadoActual;
    }
}
