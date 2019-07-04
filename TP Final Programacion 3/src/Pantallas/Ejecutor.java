/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Abstracta.TableroJuego;
import Excepcion.JuegoExcepcion;
import Principal.Zombie;

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
            
            
        TableroJuego tablero = new TableroJuego(juego);
        Zombie z1 = new Zombie();
        Zombie z2 = new Zombie();
        Zombie z3 = new Zombie();
        Zombie z4 = new Zombie();
        Zombie z5 = new Zombie();
        tablero.agregarZombie(z1);
        tablero.agregarZombie(z2);
        tablero.agregarZombie(z3);
        tablero.agregarZombie(z4);
        tablero.agregarZombie(z5);
        
        
    }
    
   
    
}
