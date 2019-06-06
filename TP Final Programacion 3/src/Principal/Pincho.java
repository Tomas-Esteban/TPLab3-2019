package Principal;

import Interfaces.IVendible;

/** Pincho es una clase de tipo de defensa de un solo uso, tiene un danio que produce al zombie y se muereuna vez que el zombie pase por encima.
	 *
	 * @param vivo
	 * @param posicion
	 * @param dmg
	 */

public class Pincho implements IVendible{

	private boolean vivo;
	private int posicion;
	private double dano;
	
	
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public double getDano() {
		return dano;
	}
	public void setDano(double dano) {
		this.dano = dano;
	}
	
	
	@Override
	public double getValor(Tienda t) {
		// TODO Auto-generated method stub
		return t.getPrecioPinchos();
	}
}
