package Principal;

public class Heroe implements IVendible
{
	private boolean disponible;

	@Override
	public double getValor(Tienda tienda) {
		// TODO Auto-generated method stub
		return tienda.getPrecioHeroe();
	}

	

	
}
