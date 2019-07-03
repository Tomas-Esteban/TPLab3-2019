package Excepcion;

public class JuegoExcepcion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String mensaje;
	
	public JuegoExcepcion(String mensaje) {
		mensaje="";
		
	}
	
	public String getMSJ() {
		return mensaje;
	}
	
}
