/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escenario;

import Baldosas.Baldosa;
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

public class Escenario implements IAcciones {
    
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
                getBaldosa(x, y).renderizar(g, x * Baldosa.ANCHO_BALDOSA, y * Baldosa.ALTO_BALDOSA);
            }
    }
    
    public Baldosa getBaldosa(int x, int y){
        Baldosa b = Baldosa.baldosas[multiBaldosas[x][y]];
        if(b == null)
            return Baldosa.rellenoNegro;
        return b;
    }
    private void cargarEscenario(String ruta){
        
       /* ancho = 5;
        alto = 5;
        
        multiBaldosas = new int [ancho][alto];
        
        for(int x = 0; x < ancho; x++){
            for(int y = 0; y < alto; y++){
                multiBaldosas[x][y] = 0;
            }
        }
         */
        
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
