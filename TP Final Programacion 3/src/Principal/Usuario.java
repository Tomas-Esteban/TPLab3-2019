package Principal;


 /** 
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 *
 * Clase usuario para acceder al juego 
 * @param nombre de usuario
 * @param cotrasena usuario
 * 
 */

public class Usuario {
	
	private String password;
	private String nombre;
	
	
	
	public Usuario( String nombre,String password) {
		this.nombre = nombre;
		this.password = password;
		
	}
	public Usuario() {
		nombre = "";
		password = "";
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
	
	
	/*
	 
	/**
	* metodo que se encarga de crear un usuario corroborando que el usuario no este creado.
	*/
	/*
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
	}*/
}