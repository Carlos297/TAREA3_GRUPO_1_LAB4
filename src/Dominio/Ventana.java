package Dominio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton boton;
	private JButton boton2;
	private JButton boton3;
	
	public Ventana(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocation(350, 350);
		setLayout(null);
		
		boton = new JButton();
		boton.setText("Ejercicio 1");
		boton.setBounds(170, 100, 140, 30);
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
		boton2.setBounds(170, 150, 140, 30);
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
		boton3.setBounds(170, 200, 140, 30);
		
		getContentPane().add(boton);
		getContentPane().add(boton2);
		getContentPane().add(boton3);
		
	}
	
	public void CambiarVisibilidad (boolean estado)
	{
		setVisible(true);
	}
	
}
