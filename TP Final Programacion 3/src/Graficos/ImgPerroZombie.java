package Graficos;

import Interfaces.IAcciones;

public class ImgPerroZombie extends ImgBaldosa implements IAcciones{
	public ImgPerroZombie (int id) {
		super(Recurso.perroZombie, id);
	}
	
	private void tick() {
		
	}
	/*private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Limpiamos la pantalla
		g.clearReact(0,0,ancho,alto);
		// "dibujamos" la imagen
		g.drawImage(Assets.grass,10,10,null);
		bs.show();
		
	}*/

}
