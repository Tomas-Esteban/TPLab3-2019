package Principal;

public class Usuario {
	
	private String password;
	private String nombre;
	
	
	
	public Usuario(String password, String nombre) {
		super();
		this.password = password;
		this.nombre = nombre;
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
	public void setContrasena(String nombre) {
		this.nombre = nombre;
	}
	
	
}
