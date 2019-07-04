package Principal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Abstracta.TableroJuego;
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

public class Tienda implements IAcciones,IVendible,ActionListener{

	private Contenedor<Torreta>listaTorreta;
	private Contenedor<Aldea>listaAldea;
	private Heroe heroe;
	private Pincho pincho;
	
	/**
	 * Atributos para poder cargar las imagenes a la interfaz grafica.
	 */
	private static int anchoTienda = 4;
	private static int tamanoBoton = 50;
	private static int espaciado = 4;
	private static int posicionX = 280;
	private static int posicionY = 350;
	
	
	private Rectangle[] boton = new Rectangle[anchoTienda];
	private Rectangle oro;
	private Rectangle vida;
	
	private Graphics g;
	
	public Tienda() {
		
		listaAldea = new Contenedor<Aldea>();
        listaTorreta = new Contenedor<Torreta>();
 
		heroe = new Heroe(100,100);
		pincho = new Pincho();
		inicializarTienda(g);
		
	}
	
	/**
	 * metodo para poder incializar las "baldosas" de la tienda como botones.
	 */
	public void inicializarTienda(Graphics g) {
		
		boton[0] = new Rectangle (posicionX+((tamanoBoton+espaciado)*1),posicionY,tamanoBoton,tamanoBoton);
		boton[1] = new Rectangle (posicionX+((tamanoBoton+espaciado)*2),posicionY,tamanoBoton,tamanoBoton);
		boton[2] = new Rectangle (posicionX+((tamanoBoton+espaciado)*3),posicionY,tamanoBoton,tamanoBoton);
		boton[3] = new Rectangle (posicionX+((tamanoBoton+espaciado)*4),posicionY,tamanoBoton,tamanoBoton);
		
		oro  = new Rectangle (140,350+tamanoBoton,tamanoBoton,tamanoBoton);
		vida = new Rectangle (200,350+tamanoBoton,tamanoBoton,tamanoBoton);
		
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

	/**
	 * metodo que se encarga de dibujar los botones de la tienda.
	 */
	@Override
	public void renderizar(Graphics g) {
			
			g.fillRect(boton[0].x, boton[0].y, boton[0].width, boton[0].height);
			g.fillRect(boton[1].x, boton[1].y, boton[1].width, boton[1].height);
			g.fillRect(boton[2].x, boton[2].y, boton[2].width, boton[2].height);
			g.fillRect(boton[3].x, boton[3].y, boton[3].width, boton[3].height);
			
			// nose porque no pasa por el if este como que no toma el mouse adentro de los botones
			/*if(boton[i].contains(Juego.mouse)) {
				
				g.setColor(new Color(255,255,255,150));
				g.fillRect(boton[i].x, boton[i].y, boton[i].width, boton[i].height);
			}*/
			
			
			
			//dibujando imagen oro y vida
			g.fillRect(oro.x,oro.y,oro.width ,oro.height);
			g.fillRect( vida.x,vida.y,vida.width,vida.height);
			g.drawString(""+TableroJuego.oro, oro.x, oro.y);
			g.drawString(""+TableroJuego.vida, vida.x, vida.y);
			
			// necesito las imagenes 
			//g.drawImage(Recurso.icono[0],oro.x,oro.y,oro.width ,oro.height, null);
            //g.drawImage(Recurso.icono[1], vida.x,vida.y,vida.width,vida.height, null);
	}

	@Override
	public double getValor(Tienda t) {
		return getValor(t);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	

}
