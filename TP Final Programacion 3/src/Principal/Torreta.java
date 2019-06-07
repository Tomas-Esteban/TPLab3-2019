package Principal;

import Interfaces.IVendible;

/**
 * La torreta es una clase que ataca, no se puede mover pero si establecer una posicion una vez comprada.
 * Esta tiene vida, daño e indica su posicion
 * @param hp
 * @param dps
 * @param posicion
 */

public class Torreta extends Defensa implements IVendible{

	public  Torreta() {
	
	}
	


	@Override
	public double getValor(Tienda t) {
		// TODO Auto-generated method stub
		return t.getPrecioTorreta();
	}
	
	
}
