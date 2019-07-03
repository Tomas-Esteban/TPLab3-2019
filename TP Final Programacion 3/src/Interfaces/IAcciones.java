package Interfaces;
import java.awt.Graphics;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que se utiliza para actualizar cada una de las imagenes renderizadas (objetos) por segundo. 
 * y actualiza nuestros objetos vida oro etc.
 * <br> <strong>Interfaces</strong> by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1uhn4eRUp3y4PFa8ohLqPOt316mDSvsGMtaPeQzy1TlE/edit#slide=id.p2" /> Interfaces en java - PowerPoint </a>
 *
 */
public interface IAcciones {
	
	
	/**
	 * Actualiza por segundo todo objeto ya sea tienda, personajes, vida y oro.
	 */
	public void actualizar();
	
	/**
	 * Metodo para hacer visible nuestras imagenes.
	 * @param g
	 */
	public void renderizar(Graphics g);
	

}
