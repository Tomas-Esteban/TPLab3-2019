package Pantallas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Principal.JsonUtil;

public class Log {

	private JFrame frame;
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
					Log window = new Log();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Log() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(comprobarUsuario()==true) {
					
					SelNivel d1 = new SelNivel();
					//JOptionPane.showMessageDialog(d1,"Bienvenido");
					
					
				}else {
					
					JFrame error = new JFrame("ERROR");
					error.setVisible(true);
					error.setSize(800,600);
					
					JOptionPane.showMessageDialog(error,"Error, que desea hacer?");
					
					nombreUsuario.setText("");
					contrasenaUsuario.setText("");
					
				}
				
				
			}
		});
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnNewButton.setBounds(175, 175, 114, 25);
		contentPane.setLayout(null);
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
	public String pideNombreUsuario() {
		return nombreUsuario.getText();
	}
	public String pideClaveUsuario() {
		return contrasenaUsuario.getText();
	}
	
	public boolean comprobarUsuario() {
		
		try {
			JSONArray arraye = new JSONArray(JsonUtil.leer());
			
			for(int i=0;i<arraye.length();i++) {
				JSONObject jo = arraye.getJSONObject(i); 
				
				if(jo.getString("nombre").equals(pideNombreUsuario()) && jo.getString("contrasena").equals(pideClaveUsuario())) {
					return true;
				}else {
					return false;
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return false;
		
		
	}

}
