/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Image;
import java.awt.image.BufferedImage;
import Utilidades.Utilidad;

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
    public static BufferedImage pincho,aldea,torreta,imgheroe,imgoro,imgvida,cespedOscuroInferior,cespedOscuroSuperior;
    public static BufferedImage castillo,muralla,cespedOscuro, rellenoNegro,baldosapiso,perroZombie;
    public static Image[] icono = new Image[100]; 
    
    /**
     * dado un sprite de imagenes este metodo incializa nuestras imagenes en pantalla, segun la posicion del sprite
     * 0 cespedOscuro
     * 1 cespedOscuroSuperior
     * 2 cespedOscuroInferior
     * 3 muralla
     * 4 rellenoNegro para la tienda
     * 8 baldosapiso
     * 6 perroZombie
     * 
     */
    public static void inicializar(){
        HojaSprites hoja = new HojaSprites(Utilidad.cargarImagen("/Utilidades/tileset.png"));
        
       cespedOscuro = hoja.ajustar(0, 0, ancho, alto);
       cespedOscuroSuperior = hoja.ajustar(ancho, 0, ancho, alto);
       cespedOscuroInferior  = hoja.ajustar((ancho * 2), 0, ancho, alto);
       muralla = hoja.ajustar((ancho * 3), 0, ancho, alto);
       rellenoNegro = hoja.ajustar((ancho*4), 0, ancho, alto);
       baldosapiso = hoja.ajustar(ancho*8, 0, ancho, alto);
       perroZombie = hoja.ajustar((ancho * 6),0, ancho, alto);
       
       icono[0]=imgheroe=hoja.ajustar((ancho*7),0, ancho, alto);
       icono[1]=torreta=hoja.ajustar(ancho*5, 0, ancho, alto);
       icono[2]=aldea=hoja.ajustar((ancho*7),(alto*1), ancho, alto);
       icono[3]=pincho=hoja.ajustar((ancho*8),(alto*1), ancho, alto);
       icono[5]=imgoro=hoja.ajustar((ancho*5),(alto*1), ancho, alto);
       icono[4]=imgvida=hoja.ajustar((ancho*6),(alto*1), ancho, alto); 
       
       
       castillo= hoja.ajustar(1,alto*1, ancho, alto);
     
    }
}
