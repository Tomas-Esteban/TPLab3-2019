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
	
}