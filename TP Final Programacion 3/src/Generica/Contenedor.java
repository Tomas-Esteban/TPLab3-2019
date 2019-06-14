package Generica;

import java.awt.Graphics;
import java.util.ArrayList;

import Interfaces.IAcciones;

public class Contenedor<T1> implements IAcciones{

	private ArrayList<T1>listaContenedora;
	
	public Contenedor(){
		listaContenedora = new ArrayList<T1>();
	}
	
	public void agregar(T1 t) {
		listaContenedora.add(t);
	}
	
	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderizar(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	
}
