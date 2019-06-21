package Interfaces;

import java.awt.Graphics;


/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Es la misma interface que la IAcciones nada mas que esta pide la posicion en el mapa.
 * Para saber donde se encuentran los Zombies o el Heroe
 * 
 * @see Interfaces.IAcciones Para mas informacion.
 *
 */
public interface IAccionesB {
	
	
	public void actualizar();
	public void renderizar(Graphics g, int x, int y);
	
}
