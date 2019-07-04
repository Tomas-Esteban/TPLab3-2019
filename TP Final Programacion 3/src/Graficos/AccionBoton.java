package Graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import Pantallas.Juego;
import java.awt.*;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase encargada del manejo de acciones del boton.
 *
 */
public class AccionBoton implements MouseMotionListener,MouseListener{

	/**
	 * metodo para saber si un mouse mantiene clickeado algo y lo arrastra.
	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		Juego.mouse = new Point((e.getX()+ 800) ,(e.getY()+ 600) );		
	}

	/**
	 * metodo para saber donde se esta moviendo el mouse.
	 */
	@Override
	public void mouseMoved(MouseEvent e) {
		Juego.mouse = new Point((e.getX()- 800) ,(e.getY()- 600) );
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("fff");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
