package Dominio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton boton;
	private JButton boton2;
	private JButton boton3;
	private JLabel lblNewLabel;
	
	public Ventana(){
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocation(350, 350);
		getContentPane().setLayout(null);
		
		boton = new JButton();
		boton.setText("Ejercicio 1");
		boton.setBounds(127, 67, 140, 30);
		boton.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Ejercicio1 eje= new Ejercicio1();
				eje.setVisible(true);
			}
		});
		
		boton2 = new JButton();
		boton2.setText("Ejercicio 2");
		boton2.setBounds(127, 120, 140, 30);
		boton2.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Ejercicio2 eje2= new Ejercicio2();
				eje2.setVisible(true);
			}
		});
		
		boton3 = new JButton();
		boton3.setText("Ejercicio 3");
		boton3.setBounds(127, 172, 140, 30);
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio3 ventanaEjercicio3 = new Ejercicio3();
				ventanaEjercicio3.setVisible(true);
			}
		});
		
		getContentPane().add(boton);
		getContentPane().add(boton2);
		getContentPane().add(boton3);
		
		lblNewLabel = new JLabel("GRUPO NRO: 1");
		lblNewLabel.setBounds(32, 25, 86, 14);
		getContentPane().add(lblNewLabel);
		
	}
	
	public void CambiarVisibilidad (boolean estado)
	{
		setVisible(true);
	}
	
}
