package Dominio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtMail;

	public Ejercicio1() 
	{
		setTitle("Ejercicio 1");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 486, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(24, 40, 73, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(24, 83, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono:");
		lblNewLabel_2.setBounds(24, 126, 73, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mail:");
		lblNewLabel_3.setBounds(24, 170, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(124, 37, 316, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(124, 80, 316, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(124, 123, 316, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtMail = new JTextField();
		txtMail.setBounds(124, 167, 316, 20);
		contentPane.add(txtMail);
		txtMail.setColumns(10);
		
		JLabel lblMostar = new JLabel("Los datos ingresados fueron: ");
		lblMostar.setBounds(24, 302, 416, 72);
		contentPane.add(lblMostar);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(txtNombre.getText().equals(""))
				{
					txtNombre.setBackground(Color.red);
				}
				if(txtApellido.getText().equals(""))
				{
					txtApellido.setBackground(Color.red);
				}
				if(txtTelefono.getText().equals(""))
				{
					txtTelefono.setBackground(Color.red);
				}
				if(txtMail.getText().equals(""))
				{
					txtMail.setBackground(Color.red);
				}
				if(txtNombre.getText().length()!=0 && txtApellido.getText().length()!=0 && txtTelefono.getText().length()!=0 && txtMail.getText().length()!=0)
				{
					lblMostar.setText("<html>Los datos ingresados fueron: NOMBRE: "+ txtNombre.getText()+ "\n - APELLIDO: "+ txtApellido.getText()+"- TELEFONO: "+ 
							txtTelefono.getText() +"- MAIL: "+txtMail.getText()+"</html>");
					
					txtNombre.setText("");
					txtNombre.setBackground(Color.white);
					txtApellido.setText("");
					txtApellido.setBackground(Color.white);
					txtTelefono.setText("");
					txtTelefono.setBackground(Color.white);
					txtMail.setText("");
					txtMail.setBackground(Color.white);
				}
			}
		});
		btnMostrar.setBounds(24, 210, 416, 23);
		contentPane.add(btnMostrar);
		
		
	}
}


