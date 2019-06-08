package Pantallas;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
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
 * Clase de la interfaz grafica Swing que se encarga de crear un login del juego.
 * <br> Tutorial sobre <strong> Swing en Eclipse </strong> </br>
 * @see {@link https://www.youtube.com/playlist?list=PLMQ4k-hUWGNmQwP3u5HP894NnQQ9lGY_d}
 * 
 */

public class Login {

	private Pantalla pantalla;
	private JPanel contentPane;
	private JTextField nombreUsuario;
	private JTextField contrasenaUsuario;
    
    

	public Login() {
		
		pantalla.crearVentana();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ver como meter metodo aca adentro
				nombreUsuario.getText();
				contrasenaUsuario.getText();
			}
		});
		btnNewButton.setBounds(175, 175, 114, 25);
		contentPane.add(btnNewButton);
		
		nombreUsuario = new JTextField();
		nombreUsuario.setBounds(175, 81, 124, 19);
		contentPane.add(nombreUsuario);
		nombreUsuario.setColumns(10);
		
		contrasenaUsuario = new JTextField();
		contrasenaUsuario.setBounds(175, 106, 124, 19);
		contentPane.add(contrasenaUsuario);
		contrasenaUsuario.setColumns(10);
		
		
	}
}
