package Principal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Abstracta.TableroJuego;
import Generica.Contenedor;
import Graficos.Escenario;
import Graficos.Recurso;
import Interfaces.IAcciones;
import Interfaces.IVendible;
import Pantallas.Juego;

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
	private static int anchoTienda = 5;
	private static int tamanoBoton = 50;
	private static int espaciado = 4;
	private static int posicionX = 280;
	private static int posicionY = 350;
	private static int itemid = -1;
	private static boolean tengoitem = false;
	
	
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
		boton[4] = new Rectangle (posicionX+((tamanoBoton+espaciado)*5),posicionY,tamanoBoton,tamanoBoton);
		
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
		// creo los "botones" para las imagenes
			
			g.fillRect(boton[0].x, boton[0].y, boton[0].width, boton[0].height);
			g.fillRect(boton[1].x, boton[1].y, boton[1].width, boton[1].height);
			g.fillRect(boton[2].x, boton[2].y, boton[2].width, boton[2].height);
			g.fillRect(boton[3].x, boton[3].y, boton[3].width, boton[3].height);
			g.fillRect(boton[4].x, boton[4].y, boton[4].width, boton[4].height);
			
			g.setColor(new Color(255,255,255));
			g.setFont(new Font(Font.SANS_SERIF,14,14));
			
			g.drawImage(Recurso.icono[0], boton[0].x, boton[0].y, boton[0].width, boton[0].height,null);
    		g.drawString(getPrecioHeroe()+"",boton[0].x,boton[0].y);
			
    		g.drawImage(Recurso.icono[1], boton[1].x, boton[1].y, boton[1].width, boton[1].height,null);
			g.drawString(getPrecioTorreta()+"",boton[1].x,boton[1].y);
			
			g.drawImage(Recurso.icono[2], boton[2].x, boton[2].y, boton[2].width, boton[2].height,null);
			g.drawString(getPrecioAldea()+"",boton[2].x,boton[2].y);
			
			g.drawImage(Recurso.icono[3], boton[3].x, boton[3].y, boton[3].width, boton[3].height,null);
			g.drawString(getPrecioPinchos()+"",boton[3].x,boton[3].y);
			
			g.fillRect(oro.x,oro.y,oro.width ,oro.height);
			g.drawImage(Recurso.icono[4],oro.x,oro.y,oro.width ,oro.height, null);
			g.drawString(""+TableroJuego.oro, oro.x, oro.y);
			
			g.fillRect(vida.x,vida.y,vida.width,vida.height);
			g.drawImage(Recurso.icono[5], vida.x,vida.y,vida.width,vida.height, null);
			g.drawString(TableroJuego.vida+"", vida.x, vida.y);
			
		// paso el cursor por los "botones" y cambia de color
			if(boton[0].contains(Juego.mouse)) {
				
				g.setColor(new Color(255,255,255,150));
				g.fillRect(boton[0].x, boton[0].y, boton[0].width, boton[0].height);
			}
			if(boton[1].contains(Juego.mouse)) {
							
				g.setColor(new Color(255,255,255,150));
				g.fillRect(boton[1].x, boton[1].y, boton[1].width, boton[1].height);
						}
			if(boton[2].contains(Juego.mouse)) {
				
				g.setColor(new Color(255,255,255,150));
				g.fillRect(boton[2].x, boton[2].y, boton[2].width, boton[2].height);
			}
			if(boton[3].contains(Juego.mouse)) {
				
				g.setColor(new Color(255,255,255,150));
				g.fillRect(boton[3].x, boton[3].y, boton[3].width, boton[3].height);
			}
			if(boton[4].contains(Juego.mouse)) {
				
				g.setColor(new Color(255,255,255,150));
				g.fillRect(boton[4].x, boton[4].y, boton[4].width, boton[4].height);
			}
			
			
            // checkea si tengo el clickeo que item y lo atrapo con el mouse
            if(tengoitem) {
            	g.drawImage(Recurso.icono[itemid],Juego.mouse.x,Juego.mouse.y,boton[itemid].width,boton[itemid].height,null);
            }
        
	}

	public int clickEnTienda(int mouse) {
		int obj=0;
		// uno cuando se clickea!!
		if(mouse == 1) {
			for(int i = 0 ; i<boton.length;i++) {
				if(boton[i].contains(Juego.mouse)) {
					tengoitem = true;
					itemid=i;
					obj = itemid;
				}
			}
		}/*if(tengoitem) {
			// no puedo hacer andar el arreglo multidimensional, por lo tanto no puedo 
			// colocar los items en la pantalla
			if(TableroJuego.oro>=precioboton[itemid]) {
				for(int y =0;y<Escenario.multiBaldosas.length;y++) {
					for(int x=0;x<Escenario.multiBaldosas[0].length;x++) {
						
							
					}
				}
			}
		}*/
	
		return obj;
}
	
	
	
	@Override
	public double getValor(Tienda t) {
		return getValor(t);
	}
	

}
