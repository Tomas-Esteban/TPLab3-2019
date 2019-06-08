package Principal;

/** 
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase padre de Torreta, Pinchos.
 * @param atributo vida.
 * @param atributo dano por seg.
 * @param posicion x,y.
 *  
 */

public class Defensa {
	
	private double hp;
	private double dps;
	private int posicionX;
	private int posicionY;
	
	
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public double getDps() {
		return dps;
	}
	public void setDps(double dps) {
		this.dps = dps;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	
	
	
}
