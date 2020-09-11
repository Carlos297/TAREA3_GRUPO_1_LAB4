package Dominio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldCantHorasComputador;
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
		
		ButtonGroup grupo = new ButtonGroup();
		
		JLabel lblElijeSistemaOperativo = new JLabel("Elije un sistema operativo");
		lblElijeSistemaOperativo.setBounds(35, 17, 146, 14);
		panel.add(lblElijeSistemaOperativo);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(205, 13, 90, 23);
		grupo.add(rdbtnWindows);
		panel.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(314, 13, 56, 23);
		grupo.add(rdbtnMac);
		panel.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(405, 13, 56, 23);
		grupo.add(rdbtnLinux);
		panel.add(rdbtnLinux);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(24, 94, 496, 118);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblElijeEspecialidad = new JLabel("Elije una especialidad");
		lblElijeEspecialidad.setBounds(47, 52, 131, 14);
		panel_1.add(lblElijeEspecialidad);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programacion");
		chckbxProgramacion.setBounds(225, 12, 141, 23);
		panel_1.add(chckbxProgramacion);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setBounds(225, 47, 141, 23);
		panel_1.add(chckbxAdministracion);
		
		JCheckBox chckbxDisGrafico = new JCheckBox("Dise\u00F1o grafico");
		chckbxDisGrafico.setBounds(225, 82, 141, 23);
		panel_1.add(chckbxDisGrafico);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(24, 232, 496, 97);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCantHorasComputador = new JLabel("Cantidad de horas en el computador:");
		lblCantHorasComputador.setBounds(93, 26, 225, 14);
		panel_2.add(lblCantHorasComputador);
		
		textFieldCantHorasComputador = new JTextField();
		textFieldCantHorasComputador.setBounds(328, 23, 86, 20);
		panel_2.add(textFieldCantHorasComputador);
		textFieldCantHorasComputador.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio3_Resultado x = new Ejercicio3_Resultado();
				
				
				x.setVisible(true);
			}
		});
		btnAceptar.setBounds(397, 63, 89, 23);
		panel_2.add(btnAceptar);
	}
}
