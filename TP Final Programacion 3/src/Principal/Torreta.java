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
 * La torreta es una clase que ataca, no se puede mover pero si establecer una posicion una vez comprada.
 * Esta tiene vida, daño e indica su posicion
 * <br> Presentacion sobre pilares de la POO by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1ln1p_6b44mKaHEJkfdimSZrOWz9hK5vg1FegjWzlkkg/edit#slide=id.g348419c47f_0_282" /> Herencia en Java - PowerPoint </a>
 * @see Principal.Defensa
 * @param hp
 * @param dps
 * @param posicion
 * 
 */

public class Torreta extends Defensa implements IVendible{

	public  Torreta() {
	
	}
	


	@Override
	public double getValor(Tienda t) {
		// TODO Auto-generated method stub
		return t.getPrecioTorreta();
	}
	
	
}
