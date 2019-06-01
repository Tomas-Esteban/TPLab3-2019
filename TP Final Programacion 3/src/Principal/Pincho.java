package Principal;

import Interfaces.IVendible;

public class Pincho implements IVendible{

	private boolean vivo;
	private int posicion;
	
	@Override
	public double getValor(Tienda t) {
		// TODO Auto-generated method stub
		return t.getPrecioPinchos();
	}
	
}
