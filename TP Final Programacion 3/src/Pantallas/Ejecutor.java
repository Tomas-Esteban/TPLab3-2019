/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Pantallas.Pantalla;

/**
 *
 * @author Pardo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Juego juego = new Juego("Towerdeefense", 800, 600);
        juego.iniciar();
        
        
    }
    
}
