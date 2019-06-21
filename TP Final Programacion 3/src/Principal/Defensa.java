package Principal;

import java.awt.Graphics;

import Interfaces.IAcciones;

/** 
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase padre de Torreta, Pinchos.
 * <br> Presentacion sobre pilares de la POO by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1ln1p_6b44mKaHEJkfdimSZrOWz9hK5vg1FegjWzlkkg/edit#slide=id.g348419c47f_0_282" /> Herencia en Java - PowerPoint </a>
 * @param atributo vida.
 * @param atributo dano por seg.
 * @param posicion x,y.
 *  
 */

public class Defensa implements IAcciones{
	
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
	@Override
	public void actualizar() {
		
	}
	@Override
	public void renderizar(Graphics g) {
		
	}
	
	
	
}
