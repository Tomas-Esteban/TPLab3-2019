package Principal;

import Interfaces.IVendible;

/**
 * La torreta es una clase que ataca, no se puede mover pero si establecer una posicion una vez comprada.
 * Esta tiene vida, daño e indica su posicion
 * @param hp
 * @param dps
 * @param posicion
 */

public class Torreta implements IVendible{

	private double hp;
	private double dps;
	private int posicion;
	
	
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public double getDps() {
		return dps;
	}
	public void setDps(double dps) {
		this.dps = dps;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


	@Override
	public double getValor(Tienda t) {
		// TODO Auto-generated method stub
		return t.getPrecioTorreta();
	}
	
	
}
