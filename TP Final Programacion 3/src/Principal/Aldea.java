package Principal;

import Interfaces.IVendible;

 /** 
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase aldea que implementa la interfaz Ivendible para obtener el valor de ella en la tienda
 * La aldea va a tener una cantidad producida de oro por segundo (oroPorSegundo)
 * y un estado, si esta vivo produce el oro (vivo).
 * 
 * @see Interfaces.IVendible; 
 * @param oroPorSegundo
 * @param vivo
 * 
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
