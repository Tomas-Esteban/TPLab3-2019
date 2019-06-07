package Pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField nombreUsuario;
	private JTextField contrasenaUsuario;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
