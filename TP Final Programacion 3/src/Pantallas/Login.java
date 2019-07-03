package Pantallas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import org.json.JSONException;
import Utilidades.SistemaJuego;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author ivanmdq22
 * @author Pardo
 * @author Nazuti.
 * @since 10/05/2019
 * @version 1.6
 * 
 * Clase que inicializa la pantalla login de usuario.
 *
 */
public class Login {

	private JFrame frame;
	private JTextField fieldUsuario;
	private JTextField fieldpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					
					Login window = new Login();
					window.frame.setVisible(true);
					
				} catch (Exception e) {e.printStackTrace();}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		fieldUsuario = new JTextField();
		fieldUsuario.setBounds(149, 75, 124, 19);
		frame.getContentPane().add(fieldUsuario);
		fieldUsuario.setColumns(10);
		
		fieldpass = new JTextField();
		fieldpass.setBounds(149, 142, 124, 19);
		frame.getContentPane().add(fieldpass);
		fieldpass.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					
						if(SistemaJuego.comprobarUsuario(pideNombreUsuario(),pideClaveUsuario())==true) {
						
							JFrame bienvenido = new JFrame("Bienvenido");
							bienvenido.setVisible(true);
							bienvenido.setSize(800,600);
							//SelNivel d1 = new SelNivel();
							JOptionPane.showMessageDialog(bienvenido,"Bienvenido");
						
						}else {
						
							JFrame error = new JFrame("ERROR");
							error.setVisible(true);
							error.setSize(800,600);
							
						
							JOptionPane.showMessageDialog(error,"Error, que desea hacer?");
						
							fieldUsuario.setText("");
							fieldpass.setText("");
						
						}
						
				} catch (JSONException e1) {e1.printStackTrace();}
				
			}
		});
		
		btnAceptar.setBounds(159, 211, 114, 25);
		frame.getContentPane().add(btnAceptar);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(73, 144, 66, 15);
		frame.getContentPane().add(lblContrasea);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(73, 77, 66, 15);
		frame.getContentPane().add(lblNombre);
	}
	
	/**
	* Metodo que obtiene el nombre del usuario de un TextField.
	* @return  los datos pasados por teclado.
	*/
	public String pideNombreUsuario() {
		return fieldUsuario.getText();
	}
	/**
	* Metodo que obtiene la contrasena del usuario de un TextField.
	* @return  los datos pasados por teclado.
	*/
	public String pideClaveUsuario() {
		return fieldpass.getText();
	}
	
}
