package Principal;

import Interfaces.IVendible;

/** 
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase hija de Personaje.
 * @see {@link Personaje}
 *  
 */

public class Heroe extends Personaje implements IVendible
{
	private boolean disponible;

	public Heroe(float x, float y) {
		
	}
	
	public Heroe(int posicionX,int posicionY, double dps, double vdm, boolean disponible) {
		super(posicionY, posicionX, dps, vdm);
		this.disponible = disponible;
	}
	
	
	public Heroe() {
		super();
		disponible=true;
	}


	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	public void actualizar() {
		
	}
	
	@Override
	public double getValor(Tienda tienda) {
		// TODO Auto-generated method stub
		return tienda.getPrecioHeroe();
	}

	
	

	
}
