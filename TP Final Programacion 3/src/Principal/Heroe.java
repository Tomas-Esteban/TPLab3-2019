package Principal;

import Interfaces.IVendible;

public class Heroe extends Personaje implements IVendible
{
	private boolean disponible;

	
	
	@Override
	public double getValor(Tienda tienda) {
		// TODO Auto-generated method stub
		return tienda.getPrecioHeroe();
	}

	

	
}
