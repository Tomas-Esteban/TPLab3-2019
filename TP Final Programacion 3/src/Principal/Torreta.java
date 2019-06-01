package Principal;

import Interfaces.IVendible;

public class Torreta implements IVendible{

	private double hp;
	private double dps;
	private int posicion;
	
	
	
	@Override
	public double getValor(Tienda t) {
		// TODO Auto-generated method stub
		return t.getPrecioTorreta();
	}
	
	
}
