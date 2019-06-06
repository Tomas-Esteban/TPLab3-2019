package Principal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		
				

		
	}
	
	/**
	 * metodo que se encarga de saber si un usuario ya esta en el archivo o no.
	 */
	public void comprobarUsuario() {
		
	}

	
	/**
	 * metodo que se encarga de crear un usuario corroborando que el usuario no este creado.
	 */
	
	public void CrearUsuario() {
		
		// buscar la forma de tomar los datos de la pantalla 
		// para no tener que crear ivanmdq22 en el metodo
		
		Usuario a1 = new Usuario("Ivanmdq22","cualquiera");
		JSONObject joUsuario = new JSONObject();
		JSONArray ja = new JSONArray();
		try {
			
			joUsuario.put("nombre",a1.getNombre());
			joUsuario.put("Contrasena", a1.getPassword());
			ja.put(joUsuario);
			JsonUtil.grabar(ja);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			JSONArray array = new JSONArray(JsonUtil.leer());
			//System.out.println(array);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
}
