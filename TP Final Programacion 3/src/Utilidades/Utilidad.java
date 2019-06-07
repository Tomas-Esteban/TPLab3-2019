/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Pardo
 */
public class Utilidad {
    
    public static String cargarArchivoComoString(String ruta){
        StringBuilder constructor = new StringBuilder();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            while((linea = br.readLine()) != null)
                constructor.append(linea + "\n");
            
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return constructor.toString();
    }
    
    public static int analizarEntero(String number){
        try{
            return Integer.parseInt(number);
        }catch(NumberFormatException e){
            e.printStackTrace();
            return 0;
        }
    }
}
