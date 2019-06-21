package Principal;


 /** 
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * 
 * la clase zombie es una clase hija que extiende de Personaje va a tener una cantida de oro que da por su muerte.
 * <br> Presentacion sobre pilares de la POO by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1ln1p_6b44mKaHEJkfdimSZrOWz9hK5vg1FegjWzlkkg/edit#slide=id.g348419c47f_0_282" /> Herencia en Java - PowerPoint </a>
 * @see Principal.Personaje
 * @param oro.
 * 
 */

public class Zombie extends Personaje{

	private double oro;

	
	public Zombie(int posicionX, int posicionY, double dps, double vdm, double oro) {
		super(posicionX,posicionY, dps, vdm);
		this.oro = oro;
	}
	
	public Zombie () {
		super();
		oro = 50;
	}
	
	
	public double getOro() {
		return oro;
	}
	public void setOro(double oro) {
		this.oro = oro;
	}
	
	
	
}
