package ejercicio7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	String sistema = "";
	String especialidad = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiquetaPregunta1 = new JLabel("Elige un sistema operativo:");
		etiquetaPregunta1.setBounds(10, 11, 165, 14);
		contentPane.add(etiquetaPregunta1);
		
		JRadioButton radioWindows = new JRadioButton("Windows");
		radioWindows.setBounds(6, 44, 94, 23);
		contentPane.add(radioWindows);
		
		JRadioButton radioLinux = new JRadioButton("Linux");
		radioLinux.setBounds(131, 44, 109, 23);
		contentPane.add(radioLinux);
		
		JRadioButton radioMac = new JRadioButton("MacOS");
		radioMac.setBounds(255, 44, 109, 23);
		contentPane.add(radioMac);
		
		JLabel etiquetaPregunta2 = new JLabel("Elige tu especialidad:");
		etiquetaPregunta2.setBounds(10, 87, 165, 14);
		contentPane.add(etiquetaPregunta2);
		
		JCheckBox checkProgramacion = new JCheckBox("Programaci\u00F3n");
		checkProgramacion.setBounds(10, 122, 97, 23);
		contentPane.add(checkProgramacion);
		
		JCheckBox checkGrafico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		checkGrafico.setBounds(131, 122, 97, 23);
		contentPane.add(checkGrafico);
		
		JCheckBox checkAdmin = new JCheckBox("Administraci\u00F3n");
		checkAdmin.setBounds(255, 122, 97, 23);
		contentPane.add(checkAdmin);
		
		JLabel etiquetaPregunta3 = new JLabel("Horas dedicadas en el ordenador al d\u00EDa:");
		etiquetaPregunta3.setBounds(10, 161, 262, 14);
		contentPane.add(etiquetaPregunta3);
		
		JLabel etiquetaValor = new JLabel("");
		etiquetaValor.setBounds(10, 196, 46, 14);
		contentPane.add(etiquetaValor);
		
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.setMaximum(10);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				etiquetaValor.setText(String.valueOf(slider.getValue()));
			}
		});
		slider.setBounds(66, 186, 200, 34);
		contentPane.add(slider);
		
		JButton botonGenerar = new JButton("Generar");
		botonGenerar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (radioWindows.isSelected()) {
					
					sistema = "Tu SO favorito es Windows.";
				}
				else if (radioLinux.isSelected()) {
					
					sistema = "Tu SO favorito es Linux.";
				}
				else if (radioMac.isSelected()) {
					
					sistema = "Tu SO favorito es MacOS.";
				}
				
				if (checkProgramacion.isSelected()) {
					
					especialidad = "\nTu especialidad es la Programación.";
				}
				
				if (checkGrafico.isSelected()) {
					
					especialidad = "\nTu especialidad es el Diseño Gráfico.";
				}
				if (checkAdmin.isSelected()) {
					
					especialidad = "\nTu especialidad es la Administración.";
				}
				if (checkProgramacion.isSelected() && checkGrafico.isSelected()) {
					
					especialidad = "\nTus especialidades son la Programación y el Diseño gráfico.";
				}
				if (checkProgramacion.isSelected() && checkAdmin.isSelected()) {
					
					especialidad = "\nTus especialidades son la Programación y la Administración.";
				}
				if (checkGrafico.isSelected() && checkAdmin.isSelected()) {
					
					especialidad = "\nTus especialidades son el Diseño Gráfico y la Administración.";
				}
				if (checkProgramacion.isSelected() && checkGrafico.isSelected() && checkAdmin.isSelected()) {
					
					especialidad = "\nTus especialidades son la Programación, el Diseño Gráfico y la Administración.";
				}

				JOptionPane.showMessageDialog(null, "" + sistema + especialidad + "\nHoras en el ordenador: " + etiquetaValor.getText());
			}
		});
		botonGenerar.setBounds(335, 186, 89, 23);
		contentPane.add(botonGenerar);
		
		
	}
}
