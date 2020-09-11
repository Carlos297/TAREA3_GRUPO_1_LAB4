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
import java.text.DecimalFormat;
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

import javax.swing.JOptionPane;

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
		textField_Promedio.setEditable(false);
		textField_Promedio.setBounds(194, 35, 138, 20);
		panel.add(textField_Promedio);
		textField_Promedio.setColumns(10);
		
		textField_Condicion = new JTextField();
		textField_Condicion.setEditable(false);
		textField_Condicion.setColumns(10);
		textField_Condicion.setBounds(194, 75, 138, 20);
		panel.add(textField_Condicion);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setToolTipText("dsfggnfnfgn");
		panel_1.setBounds(34, 23, 295, 224);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNota = new JLabel("Nota 1:");
		lblNota.setBounds(42, 39, 46, 14);
		panel_1.add(lblNota);
		
		JLabel lblNota_4 = new JLabel("Nota 2:");
		lblNota_4.setBounds(42, 82, 46, 14);
		panel_1.add(lblNota_4);
		
		JLabel lblNota_1 = new JLabel("Nota 3:");
		lblNota_1.setBounds(42, 126, 46, 14);
		panel_1.add(lblNota_1);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(42, 171, 46, 14);
		panel_1.add(lblTps);
		
		JComboBox comboBox_TPS = new JComboBox();
		comboBox_TPS.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		comboBox_TPS.setToolTipText("");
		comboBox_TPS.setForeground(Color.BLACK);
		comboBox_TPS.setBounds(130, 168, 131, 20);
		panel_1.add(comboBox_TPS);
		
		textField_Nota1 = new JTextField();
		textField_Nota1.setColumns(2);
		textField_Nota1.setBounds(130, 36, 131, 20);
		panel_1.add(textField_Nota1);
		
		
		textField_Nota2 = new JTextField();
		textField_Nota2.setColumns(2);
		textField_Nota2.setBounds(130, 79, 131, 20);
		panel_1.add(textField_Nota2);
		
		textField_Nota3 = new JTextField();
		textField_Nota3.setColumns(2);
		textField_Nota3.setBounds(130, 123, 131, 20);
		panel_1.add(textField_Nota3);
		
		
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(ValidacionTextField(textField_Nota1.getText()) && ValidacionTextField(textField_Nota2.getText()) && ValidacionTextField(textField_Nota3.getText()))
				{
					int n1 = Integer.parseInt(textField_Nota1.getText().trim());
					int n2 = Integer.parseInt(textField_Nota2.getText().trim());
					int n3 = Integer.parseInt(textField_Nota3.getText().trim());
					int suma = n1+n2+n3;
					double prom = (double)suma/3;
					
					
					DecimalFormat formato1 = new DecimalFormat("#.00");
					
					textField_Promedio.setText(String.valueOf(formato1.format(prom)));
					
					if ((n1>=8 && n2>=8 && n3>=8) && comboBox_TPS.getSelectedItem().toString()=="Aprobado")
					{
						textField_Condicion.setText("Promocionado");
					} 
					if (((n1<8)&&(n1>=6)&&(n2<8)&&(n2>=6)&&(n3<8)&&(n3>=6)) && comboBox_TPS.getSelectedItem().toString()=="Aprobado")
					{
						textField_Condicion.setText("Regular");
					}
					if (n1<6 || n2<6 || n3<6 || comboBox_TPS.getSelectedItem().toString()=="Desaprobado")
					{
						textField_Condicion.setText("Libre");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Ingrese correctamente las NOTAS [0-10]");
					textField_Nota1.setText("");
					textField_Nota2.setText("");
					textField_Nota3.setText("");
					textField_Promedio.setText("");
					textField_Condicion.setText("");
				}
			
				
			}

			private boolean ValidacionTextField(String text) {
			
				boolean flag = false;
				try
				{
					int nro = Integer.parseInt(text);
					if (nro>=0 && nro<=10)
					{
						flag = true;
					}
				}
				catch(NumberFormatException e)
				{ 		
					flag = false;
				}
				
				return flag;
			}
		});

		
		btnCalcular.setBounds(351, 115, 89, 43);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Nota1.setText("");
				textField_Nota2.setText("");
				textField_Nota3.setText("");
				textField_Promedio.setText("");
				textField_Condicion.setText("");
				
			}
		});
		btnNuevo.setBounds(351, 45, 89, 43);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnSalir.setBounds(351, 183, 89, 43);
		contentPane.add(btnSalir);
		
	}
}


