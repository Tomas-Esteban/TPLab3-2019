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
 * La clase personaje va a tener vida (o hp), 
 * una posicion en el mapa (x,y), su daño (o dps) y su velocidad de movimiento (o vdm).
 *
 * @param posicionX
 * @param posicionY
 * @param dps
 * @param vdm
 * 
 */
public class Personaje implements IAcciones {
	
	
	
	private static double hp = 100;
	private int posicionX;
	private int posicionY;
	private double dps;
	private double vdm;
	
	
	
	public Personaje(int posicionX, int posicionY, double dps, double vdm) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.dps = dps;
		this.vdm = vdm;
	}

	public Personaje() {
		posicionX=0;
		posicionY=0;
		dps=0;
		vdm=0;
		hp=100;
	}
	
	public void mover(int posX, int posY) {
		setPosicionX(posX);
		setPosicionY(posY);
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
	public double getDps() {
		return dps;
	}
	public void setDps(double dps) {
		this.dps = dps;
	}
	public double getVdm() {
		return vdm;
	}
	public void setVdm(double vdm) {
		this.vdm = vdm;
	}

	@Override
	public void actualizar() {
		
	}

	@Override
	public void renderizar(Graphics g) {
		
	}
	
	
}
