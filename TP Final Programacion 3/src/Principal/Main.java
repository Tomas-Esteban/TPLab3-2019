package Principal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		
				

		
	}
	
	/// necesitamos un metodo para que comprar el texto del JTextField con el archivo 
	
	
	/**
	 * metodo que se encarga de saber si un usuario ya esta en el archivo o no.
	 */
	public void comprobarUsuario() {
		try {
			JSONArray arraye = new JSONArray(JsonUtil.leer());
			System.out.println(arraye);
			for(int i=0;i<arraye.length();i++) {
				JSONObject jo = arraye.getJSONObject(i);
				if(jo.getString("nombre").equals(pideNombreUsuario()) && jo.getString("contrasena").equals(pideClaveUsuario())) {
					// deja el JTextField en blanco vuelve a pedir que se llene el campo tira una pantalla de error!
				}else {
					// entra en la pantalla de seleccionar nivel
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	/**
	* Metodo que obtiene el nombre del usuario de un TextField.
	* @return retorna los datos pasados por teclado.
	*/
	
	public String pideNombreUsuario() {
		return "";
	}
	/**
	* Metodo que obtiene la contrasena del usuario de un TextField.
	* @return retorna los datos pasados por teclado.
	*/
	public String pideClaveUsuario() {
		return "";
	}
	
	/**
	* metodo que se encarga de crear un usuario corroborando que el usuario no este creado.
	*/
	
	public void CrearUsuario() {
		
		// buscar la forma de tomar los datos de la pantalla 
		// para no tener que crear ivanmdq22 en el metodo
		
		//Usuario a1 = new Usuario("Ivanmdq22","cualquiera");
		String nombre = pideNombreUsuario();
		String pass = pideNombreUsuario();
		
		JSONObject joUsuario = new JSONObject();
		JSONArray ja = new JSONArray();
		try {
			//joUsuario.put("nombre",a1.getNombre());
			//joUsuario.put("Contrasena", a1.getPassword());
			joUsuario.put("nombre",nombre);
			joUsuario.put("contrasena",pass);
			ja.put(joUsuario);
			JsonUtil.grabar(ja);
			
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
}
