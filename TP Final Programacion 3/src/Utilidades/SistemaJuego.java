package Utilidades;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import Principal.Usuario;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que se encarga de corroborar datos para la pantalla login.
 *
 */
public  class SistemaJuego {

	
	/**
	 * metodo que se encarga de saber si un usuario ya esta en el archivo o no.
	 */
	public static boolean comprobarUsuario (String usuario, String pass) throws JSONException{
		boolean rta = false;
		
		try {
			
			JSONArray arraye = new JSONArray(JsonUtil.leer());
			
			for(int i=0;i<arraye.length();i++) {
				
				JSONObject jo = arraye.getJSONObject(i); 
				Usuario aux = new Usuario(jo.getString("Contrasena"),jo.getString("nombre"));
				if(aux.getNombre().equals(usuario) && aux.getPassword().equals(pass)) { 
					rta = true;
				}
			}
		}catch (JSONException e) {e.printStackTrace();}
		
		return rta;
	}
	
	 
	/**
	* metodo que se encarga de crear un usuario corroborando que el usuario no este creado.
	*/
	
	public static void CrearUsuario(String usuario, String pass) {
		
		JSONObject joUsuario = new JSONObject();
		JSONArray ja = new JSONArray();
		try {
			joUsuario.put("nombre",usuario);
			joUsuario.put("contrasena",pass);
			ja.put(joUsuario);
			JsonUtil.grabar(ja);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
