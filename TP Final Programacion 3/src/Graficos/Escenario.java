package Graficos;

import Interfaces.IAcciones;
import Utilidades.Utilidad;
import java.awt.Graphics;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que permite crear un objeto Escenario.
 * @param alto y ancho.
 * @param posicion x, y.
 * @param arreglo doble de baldosas.
 * 
 */

public class Escenario implements IAcciones{
    
	private int ancho, alto;
    private int posicionX, posicionY;
    private int [][] multiBaldosas;
    
    public Escenario(String ruta){
        cargarEscenario(ruta);
        
    }
 
    @Override
    public void actualizar(){
        
    }
    
    @Override
    public void renderizar(Graphics g){
        for(int y = 0; y < alto; y++)
            for(int x = 0; x < ancho; x++){
                getBaldosa(x, y).renderizar(g, x * ImgBaldosa.ANCHO_BALDOSA, y * ImgBaldosa.ALTO_BALDOSA);
            }
    }
    
    /**
     * Metodo que se encarga de generar las baldosas negras de nuestra tienda
     * @param x
     * @param y
     * @return BaldosaNegra
     */
    public ImgBaldosa getBaldosa(int x, int y){
        ImgBaldosa baldosaNegra = ImgBaldosa.baldosas[multiBaldosas[x][y]];
        if(baldosaNegra == null)
            return ImgBaldosa.rellenoNegro;
        return baldosaNegra;
    }
    
    /**
     * Metodo que se encarga de generar nuestras baldosas como si fuera mapa en la interfaz 
     * @param ruta
     */
    private void cargarEscenario(String ruta){
        
        String archivo = Utilidad.cargarArchivoComoString(ruta);
        String[] numeros = archivo.split("\\s+");
        ancho = Utilidad.analizarEntero(numeros[0]);
        alto = Utilidad.analizarEntero(numeros[1]);                 //<-----------------------------------------------------------------------
        posicionX = Utilidad.analizarEntero(numeros[2]);                                                                                    //
        posicionY = Utilidad.analizarEntero(numeros[3]);                                                                                    //
                                                                                                                                            //
        multiBaldosas = new int[ancho][alto];                                                                                               //
        
        for(int y = 0;y < alto; y++){
        	for(int x = 0;x <ancho; x++){                                                                                                   //-|
            	System.out.println(" "+ x + " "+ y + " " + Utilidad.analizarEntero(numeros[( (x + y * ancho + 4))]));
            	multiBaldosas[x][y] = Utilidad.analizarEntero(numeros[( (x + y * ancho + 4)) ]); // el cuatro equivale a la cantidad de variables aca -|
           }
        }
    }
	
}
