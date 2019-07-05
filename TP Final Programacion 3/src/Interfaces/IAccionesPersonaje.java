package Interfaces;


/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Zombies o el Heroe utilizaran esta interfaz para generar o recibir daño.
 * <br> <strong>Interfaces</strong> by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1uhn4eRUp3y4PFa8ohLqPOt316mDSvsGMtaPeQzy1TlE/edit#slide=id.p2" /> Interfaces en java - PowerPoint </a>
 * 
 *
 */
public interface IAccionesPersonaje {
	
	
	public void recibirDano(double cant);
	public boolean morir();
	public double atacar();
	
	
}
