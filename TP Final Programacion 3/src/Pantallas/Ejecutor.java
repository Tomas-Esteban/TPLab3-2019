/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Excepcion.JuegoExcepcion;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase Main que inicializa el juego.
 * 
 */

public class Ejecutor {

    /**
     * @param args the command line arguments
     */
	
    public static void main(String[] args) {
        
    	/*Login login = new Login();
    	if(login) {*/
    		Juego juego = new Juego("Towerdeefense", 800, 600);
            juego.iniciar();
        /*}else{
            throw new JuegoExcepcion("Error al inciar sesion");
    	}*/
        
       
    }
    
   
    
}
