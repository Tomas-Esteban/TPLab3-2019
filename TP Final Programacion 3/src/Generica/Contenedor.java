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
 * @see Principal.Tienda para ver su implementacion.
 * @param <T1> contenedor HashMap, tendra precio y objeto (Zombie aldea torreta)
 * 
 */

public class Contenedor<T1> implements IAcciones {

	private HashMap<T1,Integer>listaContenedora;
	
	public Contenedor(){
		listaContenedora = new HashMap<T1,Integer>();
	}
	
	public void agregar(T1 param,int i) {
		listaContenedora.put(param,i);
	}

	public void eliminar(T1 param) {
		listaContenedora.remove(param);
	}
	
	
	/**
	 * va actualizando (contando) la cantidad o descontando la cantidad en el contenedor.
	 */
	@Override
	public void actualizar() {
		
	}

	
	@Override
	public void renderizar(Graphics g) {
	
		
	}
	
}
