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
 * Clase Hija de Estado que permite al programador saber en que situacion se encuentra el menu del juego. 
 * <br> Presentacion sobre pilares de la POO by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1ln1p_6b44mKaHEJkfdimSZrOWz9hK5vg1FegjWzlkkg/edit#slide=id.g348419c47f_0_282" /> Herencia en Java - PowerPoint </a>
 * @see  Estado.Tablero
 * @param objeto estatico que indica el estado actual de la partida.
 * 
 * 
 */
public class TableroMenu extends Tablero {
    
    public TableroMenu(Juego juego){
        super(juego);
    }

    @Override
    public void actualizar() {
    	
    }

    @Override
    public void renderizar(Graphics g) {
    
    }
    
    
}
