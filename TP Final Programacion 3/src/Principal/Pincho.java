package Principal;

import Interfaces.IVendible;

/** Pincho es una clase de tipo de defensa de un solo uso, tiene un danio que produce al zombie y se muereuna vez que el zombie pase por encima.
	 *
	 */

public class Pincho extends Defensa implements IVendible{

	private boolean vivo;
	
	
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	
	
	@Override
	public double getValor(Tienda t) {
		// TODO Auto-generated method stub
		return t.getPrecioPinchos();
	}
}
