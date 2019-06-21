package Generica;

import java.awt.Graphics;
import java.util.HashMap;

import Interfaces.IAcciones;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase contenedora generica instanciada con un hashmap para poder guardar
 * el precio de los articulos de la tienda.
 * @see Tienda.Tienda para ver su implementacion.
 * @param <T1>
 * 
 */

public class Contenedor<T1> implements IAcciones{

	private HashMap<T1,Integer>listaContenedora;
	
	public Contenedor(){
		listaContenedora = new HashMap<T1,Integer>();
	}
	
	public void agregar(T1 t,int i) {
		listaContenedora.put(t,i);
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
