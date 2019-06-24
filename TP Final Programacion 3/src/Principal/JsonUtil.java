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
 * <br> Presentacion JSon by @author Benoffi7 </br>
 * @see <a href = "https://docs.google.com/presentation/d/1ZERtYDPQC76gweYqYi8X2dWs3T8JNzI79QX2j8ZRY5I/edit#slide=id.p1" /> Introduccion a JSon - PowerPoint </a>
 * <br> Presentacion Archivos by @author Benoffi7 </br>
 * @see <a href = "@see <a href = "https://docs.google.com/presentation/d/1ZERtYDPQC76gweYqYi8X2dWs3T8JNzI79QX2j8ZRY5I/edit#slide=id.p1" /> Introduccion a JSon - PowerPoint </a>" /> Introduccion a Archivos - PowerPoint </a>
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
		
		/*
		public static void leerJSon() {
			try {
				
				JSONArray arraye = new JSONArray(JsonUtil.leer());
				
				for(int i=0;i<arraye.length();i++) {
					JSONObject jo = arraye.getJSONObject(i);
				}
				
			}catch (JSONException e) {
				e.printStackTrace();
			}
		}*/
}
