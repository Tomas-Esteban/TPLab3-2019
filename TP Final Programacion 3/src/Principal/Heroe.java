package Principal;

import Interfaces.IVendible;

public class Heroe extends Personaje implements IVendible
{
	private boolean disponible;

	
	public Heroe(int posicion, double dps, double vdm, boolean disponible) {
		super(posicion, dps, vdm);
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



	@Override
	public double getValor(Tienda tienda) {
		// TODO Auto-generated method stub
		return tienda.getPrecioHeroe();
	}

	

	
}
