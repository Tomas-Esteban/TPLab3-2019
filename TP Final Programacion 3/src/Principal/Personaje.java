package Principal;

public class Personaje {
	
	/** La clase personaje va a tener vida (o hp), una posicion en el mapa, su daño (o dps) y su velocidad de movimiento (o vdm)
	 *
	 * @param posicion
	 * @param dps
	 * @param vdm
	 */
	
	private static double hp = 100;
	private int posicion;
	private double dps;
	private double vdm;
	
	
	public Personaje(int posicion, double dps, double vdm) {
		this.posicion = posicion;
		this.dps = dps;
		this.vdm = vdm;
	}
	
	public Personaje() {
		posicion=0;
		dps=0;
		vdm=0;
	}
	
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
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
	
	
}
