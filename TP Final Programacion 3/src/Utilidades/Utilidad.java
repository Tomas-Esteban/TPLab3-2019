package Utilidades;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


 /** 
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * 
 * Clase auxiliar para cargar informacion desde un archivo y convertirlo todo a string.
 * <br> Presentacion Archivos by @author Benoffi7 </br>
 * @see <a href = "@see <a href = "https://docs.google.com/presentation/d/1ZERtYDPQC76gweYqYi8X2dWs3T8JNzI79QX2j8ZRY5I/edit#slide=id.p1" /> Introduccion a JSon - PowerPoint </a>" /> Introduccion a Archivos - PowerPoint </a>
 * 
 * 
 */
public class Utilidad {
    /**
     * Metodo que con nuestro parametro ruta crea un buffer lee cada linea de nuestro archivo
     * y lo guarda en una cadena de caracteres
     * @param ruta de nuestro archivo
     * @return una cadena de caracteres
     */
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
    
    /**
     * Metodo para convertir un String a un Integer.
     * @param cualquier String
     * @return un entero
     */
    public static int analizarEntero(String numero){
        try{
            return Integer.parseInt(numero);
        }catch(NumberFormatException e){
            e.printStackTrace();
            return 0;
        }
    }
    /**
     * Para cargar nuestra imagen este metodo busca la ruta de nuestro archivo.
     * @param ruta
     * @return la ruta de nuestro archivo
     */
    public static BufferedImage cargarImagen(String ruta){
        
        try {
            return ImageIO.read(Utilidad.class.getResource(ruta));
        } catch (IOException ex) {
            Logger.getLogger(Utilidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
