/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que permite crear un objeto baldosa de en la cual se situa la muralla. (clase hija que extiende de Baldosa)
 * <br> Presentacion sobre pilares de la POO by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1ln1p_6b44mKaHEJkfdimSZrOWz9hK5vg1FegjWzlkkg/edit#slide=id.g348419c47f_0_282" /> Herenecia en Java - PowerPoint</a>
 * @see  Graficos.ImgBaldosa
 * 
 */

public class ImgBaldosaMuralla extends ImgBaldosa {

    public ImgBaldosaMuralla(int id) {
        super(Recurso.muralla, id);
    }
    
    
    @Override
     public boolean esSolido(){
        return true;
    }
    
}
