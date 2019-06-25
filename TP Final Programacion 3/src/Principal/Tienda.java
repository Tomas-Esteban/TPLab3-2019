package Principal;

import java.awt.*;

import Generica.Contenedor;
import Interfaces.IAcciones;
import Interfaces.IVendible;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que se encuentra para el usuario para poder comprar los objetos y
 * poder defender de la oleada zombie.
 * 
 *
 */

public class Tienda implements IAcciones,IVendible{

	
	private Contenedor<Torreta>listaTorreta;
	private Contenedor<Aldea>listaAldea;
	private Heroe heroe;
	private Pincho pincho;
	
	/**
	 * Atributos para poder cargar las imagenes a la interfaz grafica.
	 */
	public static int anchoTienda = 8;
	public static int tamanoBoton = 32;
	public int espaciado = 2;
	public int posicionX = 280;
	public int posicionY = 350;
	public Rectangle[] boton = new Rectangle[anchoTienda];
	
	
	public Tienda() {
		
		listaAldea = new Contenedor<Aldea>();
        listaTorreta = new Contenedor<Torreta>();
 
		heroe = new Heroe(100,100);
		pincho = new Pincho();
		inicializarTienda();
		
		
		
	}
	
	/**
	 * metodo para poder incializar las "baldosas" de la tienda como botones.
	 */
	public void inicializarTienda() {
		for(int i = 0; i < boton.length; i++ ) {
			boton[i] = new Rectangle (posicionX+((tamanoBoton+espaciado)*i),posicionY,tamanoBoton,tamanoBoton);
	
		}
	}
	
	public double getPrecioAldea() {
			return 50;
	}
	public double getPrecioHeroe() {
		return 350;
	}
	public double getPrecioPinchos() {
		return 25;
	}
	public double getPrecioTorreta() {
		return 100;
	}

	@Override
	public void actualizar() {
		heroe.actualizar();
		pincho.actualizar();
		listaAldea.actualizar();
		listaTorreta.actualizar();
	}

	@Override
	public void renderizar(Graphics g) {
	
		for(int i = 0; i<boton.length; i++ ) {
			g.fillRect(boton[i].x, boton[i].y, boton[i].width, boton[i].height);
		}
	}

	@Override
	public double getValor(Tienda t) {
		return getValor(t);
	}
	

}