package Graficos;


/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que permite crear un objeto zombie para la Pantalla. Clase hija que extiende de Baldosa.
 * <br> Presentacion sobre pilares de la POO by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1ln1p_6b44mKaHEJkfdimSZrOWz9hK5vg1FegjWzlkkg/edit#slide=id.g348419c47f_0_282" /> Herenecia en Java - PowerPoint</a>
 * @see  Graficos.ImgBaldosa
 * 
 */
public class ImgPerroZombie extends ImgBaldosa {
	
	public ImgPerroZombie (int id) {
		super(Recurso.perroZombie, id);
	}

}
