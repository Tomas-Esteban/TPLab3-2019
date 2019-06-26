package Graficos;
import java.awt.*;
public class Moustro extends Rectangle {
	public int mounstroTam = 32;
	
	
	public Moustro() {
	
	}
	
	public void spawnMoustro() {
		for(int y= 0; y< 800 ; y	++) {
			
		}
	}
	
	
	
	
	
	
	
	private void tick() {
		
	}
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if( bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
	}
}
