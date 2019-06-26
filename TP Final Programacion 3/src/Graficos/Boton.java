package Graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import Pantallas.Juego;

import java.awt.*;

public class Boton implements MouseMotionListener,MouseListener{

	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

	@Override
	public void mouseDragged(MouseEvent e) {
		Juego.mse = new Point((e.getX()+ 800) ,(e.getY()+ 600) );		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Juego.mse = new Point((e.getX()- 800) ,(e.getY()- 600) );
		
	}

}
