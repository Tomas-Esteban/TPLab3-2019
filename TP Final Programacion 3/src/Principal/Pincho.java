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
 * Clase que implementa la interfaz IVendible para saber el valor en tienda de un Pincho. Es una clase de tipo de
 * defensa de un solo uso,tiene un danio que produce al zombie y se muereuna vez que el zombie pase por encima.
 * @see {@link Defensa} 
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
