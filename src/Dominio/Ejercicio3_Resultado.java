package Dominio;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;

public class Ejercicio3_Resultado extends JFrame {
	
	private JTextField txtSistemaOperativo;
	private JTextField txtEspecialidad;
	private JTextField txtCantHorasComputador;
	
	public Ejercicio3_Resultado() {
		setAutoRequestFocus(false);
		setTitle("Mensaje");
		getContentPane().setLayout(null);
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(276, 144);
		setLocation(350, 350);
		
		txtSistemaOperativo = new JTextField();
		
		txtEspecialidad = new JTextField();
		
		txtCantHorasComputador = new JTextField();
		
		
		JLabel lblMensaje = new JLabel("");
		lblMensaje.setBounds(27, 21, 198, 23);
		getContentPane().add(lblMensaje);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnAceptar.setBounds(87, 55, 89, 23);
		getContentPane().add(btnAceptar);
	}
	
	public void CambiarVisibilidad (boolean estado)
	{
		setVisible(true);
	}

	public void Resultado(String txtResultadoSistemaOperativo) {
		// TODO Auto-generated method stub
		
	}
	
	
}
