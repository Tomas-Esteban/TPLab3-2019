package Principal;

import java.util.HashMap;

import Interfaces.IVendible;

public class Tienda {
	
	private HashMap<IVendible,Integer>mapaPrecios;
	
	
	public Tienda() 
	{
		Heroe h1 = new Heroe();
		mapaPrecios.put(h1,1);
		getPrecioHeroe();
		Torreta t1 = new Torreta();
		mapaPrecios.put(t1,15);
		getPrecioTorreta();
		Pincho p1 = new Pincho();
		mapaPrecios.put(p1,5);
		getPrecioPinchos();
		Aldea a1 = new Aldea();
		mapaPrecios.put(a1,5);
		getPrecioAldea();
	}
	
	public double getPrecioHeroe() {
		return 500;
	}
	public double getPrecioTorreta() {
		return 150;
	}
	public double getPrecioPinchos() {
		return 100;
	}
	public double getPrecioAldea() {
		return 75;
	}
}
