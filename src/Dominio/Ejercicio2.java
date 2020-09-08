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
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ejercicio2 extends JFrame {

	
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtMail;
	private JTextField textField_Nota1;
	private JTextField textField_Nota2;
	private JTextField textField_Nota3;
	private JTextField textField_Promedio;
	private JTextField textField_Condicion;
	
	public Ejercicio2() 
	
	{
		
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 486, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setToolTipText("dsfggnfnfgn");
		panel.setBounds(34, 266, 406, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(73, 38, 94, 14);
		panel.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(73, 78, 94, 14);
		panel.add(lblCondicion);
		
		textField_Promedio = new JTextField();
		textField_Promedio.setBounds(194, 35, 138, 20);
		panel.add(textField_Promedio);
		textField_Promedio.setColumns(10);
		
		textField_Condicion = new JTextField();
		textField_Condicion.setColumns(10);
		textField_Condicion.setBounds(194, 75, 138, 20);
		panel.add(textField_Condicion);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setToolTipText("dsfggnfnfgn");
		panel_1.setBounds(34, 23, 295, 232);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNota = new JLabel("Nota 1");
		lblNota.setBounds(10, 31, 46, 14);
		panel_1.add(lblNota);
		
		JLabel lblNota_4 = new JLabel("Nota 2");
		lblNota_4.setBounds(10, 67, 46, 14);
		panel_1.add(lblNota_4);
		
		JLabel lblNota_1 = new JLabel("Nota 3");
		lblNota_1.setBounds(10, 113, 46, 14);
		panel_1.add(lblNota_1);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(10, 171, 46, 14);
		panel_1.add(lblTps);
		
		JComboBox comboBox_TPS = new JComboBox();
		comboBox_TPS.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		comboBox_TPS.setToolTipText("");
		comboBox_TPS.setForeground(Color.BLACK);
		comboBox_TPS.setBounds(130, 168, 131, 20);
		panel_1.add(comboBox_TPS);
		
		textField_Nota1 = new JTextField();
		textField_Nota1.setBounds(130, 28, 131, 20);
		panel_1.add(textField_Nota1);
		textField_Nota1.setColumns(10);
		
		textField_Nota2 = new JTextField();
		textField_Nota2.setColumns(10);
		textField_Nota2.setBounds(130, 64, 131, 20);
		panel_1.add(textField_Nota2);
		
		textField_Nota3 = new JTextField();
		textField_Nota3.setColumns(10);
		textField_Nota3.setBounds(130, 110, 131, 20);
		panel_1.add(textField_Nota3);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(351, 115, 89, 43);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(351, 45, 89, 43);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(351, 183, 89, 43);
		contentPane.add(btnSalir);
		
	}
}
