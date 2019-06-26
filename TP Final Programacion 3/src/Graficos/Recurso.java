/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Image;
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
    public static BufferedImage imgoro,imgvida,jugador,cespedOscuroInferior,cespedOscuroSuperior, muralla,cespedOscuro, rellenoNegro,baldosapiso,castillo,perroZombie;
    public static Image[] icono = new Image[100]; 
    
    public static void inicializar(){
        HojaSprites hoja = new HojaSprites(CargadorImagen.cargarImagen("/Utilidades/tileset.png"));
        
       cespedOscuro = hoja.ajustar(0, 0, ancho, alto);
       cespedOscuroSuperior = hoja.ajustar(ancho, 0, ancho, alto);
       cespedOscuroInferior  = hoja.ajustar((ancho * 2), 0, ancho, alto);
       muralla = hoja.ajustar((ancho * 3), 0, ancho, alto);
       rellenoNegro = hoja.ajustar((ancho*4), 0, ancho, alto);
       baldosapiso = hoja.ajustar(ancho*8, 0, ancho, alto);
       castillo= hoja.ajustar(0,4, ancho, alto);
       perroZombie = hoja.ajustar((ancho * 6),0, ancho, alto);
       // 5 torreta 6 perro zombie 7 heroe 8 piso 
       
     
    }
}
