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
 * Clase hija de Personaje.
 * * <br> Presentacion sobre pilares de la POO by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1ln1p_6b44mKaHEJkfdimSZrOWz9hK5vg1FegjWzlkkg/edit#slide=id.g348419c47f_0_282" /> Herencia en Java - PowerPoint </a>
 * @see Interfaces.IVendible
 * @see Principal.Personaje
 *  
 */

public class Heroe extends Personaje implements IVendible{
	
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

	
	@Override
	public double getValor(Tienda tienda) {
		return tienda.getPrecioHeroe();
	}



	
	

	
}
