package Principal;

/**
 * Castillo: contiene una muralla que es su tipo de defensa, una vez que rompan la muralla no puede volver a construirse, una tienda donde compra los items o torretas y una cantidad de vidas
 * @param muralla
 * @param tienda
 */

public class Castillo {
	
	private Muralla muralla;
	private Tienda tienda;
	private static int vidas = 5;
	
	
	public Castillo(Muralla muralla, Tienda tienda) {
	
		this.muralla = muralla;
		this.tienda = tienda;
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
