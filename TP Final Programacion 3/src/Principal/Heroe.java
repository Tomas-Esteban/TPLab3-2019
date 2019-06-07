package Principal;

import Interfaces.IVendible;

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
