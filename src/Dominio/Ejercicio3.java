package Dominio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Ejercicio3 extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	public Ejercicio3() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 300, 561, 390);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(24, 24, 496, 49);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setBounds(35, 17, 135, 14);
		panel.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(205, 13, 90, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mac");
		rdbtnNewRadioButton_1.setBounds(314, 13, 56, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Linux");
		rdbtnNewRadioButton_2.setBounds(405, 13, 56, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(24, 94, 496, 118);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Elije una especialidad");
		lblNewLabel_1.setBounds(63, 52, 115, 14);
		panel_1.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programacion");
		chckbxNewCheckBox.setBounds(225, 12, 141, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Administracion");
		chckbxNewCheckBox_1.setBounds(225, 47, 141, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Dise\u00F1o grafico");
		chckbxNewCheckBox_2.setBounds(225, 82, 141, 23);
		panel_1.add(chckbxNewCheckBox_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(24, 232, 496, 97);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Cantidad de horas en el computador:");
		lblNewLabel_2.setBounds(93, 26, 225, 14);
		panel_2.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(328, 23, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(397, 63, 89, 23);
		panel_2.add(btnNewButton);
	}
}
