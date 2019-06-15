package Tienda;
import java.awt.*;

import Interfaces.IAcciones;

public class Tienda implements IAcciones{

	public static int anchoTienda = 8;
	public static int tamanoBoton = 32;
	
	public Rectangle[] boton = new Rectangle[anchoTienda];
	
	
	public Tienda() {
		
		inicializarTienda();
		
		
		
	}
	
	
	public void inicializarTienda() {
		for(int i = 0; i < boton.length; i++ ) {
			boton[i] = new Rectangle (420,420,tamanoBoton,tamanoBoton);
	
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


	public double getPrecioAldea() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getPrecioHeroe() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getPrecioPinchos() {
		// TODO Auto-generated method stub
		return 0;
	}


	public double getPrecioTorreta() {
		// TODO Auto-generated method stub
		return 0;
	}

}
