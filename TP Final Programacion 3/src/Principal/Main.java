package Principal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		
		Usuario a1 = new Usuario("Ivanmdq22","cualquiera");
		JSONObject joUsuario = new JSONObject();
		JSONArray ja = new JSONArray();
		try {
			
			joUsuario.put("Contrasena", a1.getPassword());
			joUsuario.put("nombre",a1.getNombre());
			ja.put(joUsuario);
			JsonUtil.grabar(ja);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(JsonUtil.leer());
	
		
	}

}
