package Principal;

import Interfaces.IVendible;

public class Aldea implements IVendible {

	private double oroPorSegundo;
	private boolean vivo;
	
	@Override
	public double getValor(Tienda t) {
		// TODO Auto-generated method stub
		return t.getPrecioAldea();
	}
		
}
