/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.image.BufferedImage;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que inicializa todas las imagenes de la interfaz grafica.
 * @param ancho y alto
 * @param imagen jugador,cespedOscuroInferior, cespedOscuroSuperior, muralla, cespedOscuro.
 * 
 */

public class Recurso {
    
    private static final int ancho = 32, alto = 32;
    public static BufferedImage jugador,cespedOscuroInferior,cespedOscuroSuperior, muralla,cespedOscuro;
    
    public static void inicializar(){
        HojaSprites hoja = new HojaSprites(CargadorImagen.cargarImagen("/recursos/texturas/bg.png"));
        
       jugador = hoja.ajustar(0, 0, ancho, alto);
       cespedOscuroInferior = hoja.ajustar(ancho, 0, ancho, alto);
       cespedOscuroSuperior = hoja.ajustar(ancho * 2, 0, ancho, alto);
       muralla = hoja.ajustar(ancho * 3, 0, ancho, alto);
       cespedOscuro = hoja.ajustar(0, alto, ancho, alto);
        
    }
}
