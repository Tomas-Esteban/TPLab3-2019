package Tienda;
import java.awt.*;

import Interfaces.IAcciones;

public class Tienda implements IAcciones{

	public static int anchoTienda = 8;
	public static int tamañoBoton = 32;
	
	public Rectangle[] boton = new Rectangle[anchoTienda];
	
	
	public Tienda() {
		
		inicializarTienda();
		
		
		
	}
	
	
	public void inicializarTienda() {
		for(int i = 0; i < boton.length; i++ ) {
			boton[i] = new Rectangle (220,10,tamañoBoton,tamañoBoton);
	
		}
	}


	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void renderizar(Graphics g) {
	
		for(int i = 0; i<boton.length; i++ ) {
			g.fillRect(boton[i].x, boton[i].y, boton[i].width, boton[i].height);
		}
	}
	
}
