/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baldosas;

import Graficos.Recurso;
import java.awt.image.BufferedImage;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que permite crear un objeto baldosa de caracteristica "cesped oscuro interior". Clase hija que extiende de Baldosa.
 * @see {@link Baldosa}
 * 
 */
public class BaldosaCespedOscuroInferior extends Baldosa{

    public BaldosaCespedOscuroInferior(int id) {
        super(Recurso.cespedOscuroInferior, id);
    }
    
}
