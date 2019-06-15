package Principal;

import Tienda.Tienda;

/** 
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase castillo que contiene una muralla , una vez que rompan la muralla no puede volver a construirse (pierde la partida)
 * una tienda donde compra los items o torretas y una cantidad de vidas
 * 
 * @param objeto muralla
 * @param objeto tienda
 *
 */

public class Castillo {
	
	private Muralla muralla;
	private Tienda tienda;

	public Castillo() {
		muralla = new Muralla();
		tienda = new Tienda();
	}

	public Muralla getMuralla() {
		return muralla;
	}

	public void setMuralla(Muralla muralla) {
		this.muralla = muralla;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	
	
}
