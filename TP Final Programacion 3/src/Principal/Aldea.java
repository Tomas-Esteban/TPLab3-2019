package Principal;

import Interfaces.IVendible;

/** La aldea va a tener una cantidad producida de oro por segundo (oroPorSegundo) y un estado, si esta vivo produce el oro(vivo).
*
* @param oroPorSegundo
* @param vivo
*/

public class Aldea implements IVendible {

	private double oroPorSegundo;
	private boolean vivo;
	
	
	
	public double getOroPorSegundo() {
		return oroPorSegundo;
	}
	public void setOroPorSegundo(double oroPorSegundo) {
		this.oroPorSegundo = oroPorSegundo;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}


	@Override
	public double getValor(Tienda t) {
		// TODO Auto-generated method stub
		return t.getPrecioAldea();
	}
		
}
