package Principal;

import java.util.ArrayList;

public class Linea {
	
	private ArrayList<Zombie>listaZombie;
	private ArrayList<Torreta>listaTorreta;
	private ArrayList<Aldea>listaAldeas;
	private Heroe heroe;
	private Castillo castillo;
	private Pincho pincho;
	
	public Linea() {
		listaAldeas = new ArrayList<>();
		listaTorreta = new ArrayList<>();
		listaZombie = new ArrayList<>();
		heroe = new Heroe();
		castillo = new Castillo();
		pincho = new Pincho();
		}
	
}
