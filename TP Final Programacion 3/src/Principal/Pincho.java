package Principal;

import java.awt.Graphics;

import Interfaces.IAcciones;
import Interfaces.IVendible;
import Tienda.Tienda;
 
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
 * <br> Presentacion sobre pilares de la POO by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1ln1p_6b44mKaHEJkfdimSZrOWz9hK5vg1FegjWzlkkg/edit#slide=id.g348419c47f_0_282" /> Herencia en Java - PowerPoint </a>
 * @see Principal.Defensa
 *
 */

public class Pincho extends Defensa implements IVendible,IAcciones{

	private boolean vivo;
	
	public Pincho() {
		super();
	}
	
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	
	
	@Override
	public double getValor(Tienda t) {
		return t.getPrecioPinchos();
	}
	
	@Override
	public void actualizar() {
	
		super.actualizar();
	}
	
	@Override
	public void renderizar(Graphics g) {
		super.renderizar(g);
		
	}
}
