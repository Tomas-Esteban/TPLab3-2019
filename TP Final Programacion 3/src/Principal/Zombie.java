package Principal;


/** 
 * la clase zombie va a tener una cantida de oro que da por su muerte
 */

public class Zombie extends Personaje{

	private double oro;

	
	public Zombie(int posicionX, int posicionY, double dps, double vdm, double oro) {
		super(posicionX,posicionY, dps, vdm);
		this.oro = oro;
	}
	
	public Zombie () {
		super();
		oro = 0;
	}
	
	
	public double getOro() {
		return oro;
	}
	public void setOro(double oro) {
		this.oro = oro;
	}
	
	
	
}
