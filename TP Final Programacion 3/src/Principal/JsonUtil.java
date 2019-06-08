package Principal;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;

/** 
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase para grabar un arreglo de objetos Json en un Archivo
 *  
 */

public class JsonUtil {

		public static void grabar(JSONArray array) {
			try {
				FileWriter file = new FileWriter("Datos.json");
				file.write(array.toString());
				file.flush();
				file.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public static String leer() 
		{
			String contenido = "";
			try 
			{
				contenido = new String(Files.readAllBytes(Paths.get("Datos.json")));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			return contenido;
		}
}

