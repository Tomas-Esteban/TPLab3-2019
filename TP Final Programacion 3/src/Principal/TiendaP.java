package Principal;

import java.awt.Graphics;
import java.util.HashMap;

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
* Clase que dispone de los articulos (torretas, pinchos, aldeas o heroe) para la defensa del castillo.
* @param Coleccion de mapa con objetos que implementan la interfaz IVendible y su precio en tienda.
*
*/

public class TiendaP implements IAcciones{
	
	private HashMap<IVendible,Integer>mapaPrecios;
	
	
	public TiendaP() 
	{
		mapaPrecios = new HashMap<IVendible, Integer>();
		//heroe = new Heroe(100, 100); // <---- es para la img.
		Heroe h1 = new Heroe();
		mapaPrecios.put(h1,1);
		getPrecioHeroe();
		
		Torreta t1 = new Torreta();
		mapaPrecios.put(t1,15);
		getPrecioTorreta();
		
		Pincho p1 = new Pincho();
		mapaPrecios.put(p1,5);
		getPrecioPinchos();
		
		Aldea a1 = new Aldea();
		mapaPrecios.put(a1,5);
		getPrecioAldea();
	}
	
	public double getPrecioHeroe() {
		return 500;
	}
	public double getPrecioTorreta() {
		return 150;
	}
	public double getPrecioPinchos() {
		return 100;
	}
	public double getPrecioAldea() {
		return 75;
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderizar(Graphics g) {
		// TODO Auto-generated method stub
		
	}
}
