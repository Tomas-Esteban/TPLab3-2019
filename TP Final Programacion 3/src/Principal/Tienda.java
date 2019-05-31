package Principal;

import java.util.ArrayList;
import java.util.HashMap;

public class Tienda {
	private HashMap<IVendible,Integer>mapaPrecios;
	
	public Tienda() 
	{
		Heroe key = new Heroe();
		mapaPrecios.put(key,1);
		getPrecioHeroe();
	}
	
	public double getPrecioHeroe() {
		return 500;
	}
}
