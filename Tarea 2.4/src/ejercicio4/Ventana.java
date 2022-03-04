//Escribe una aplicación gráfica con una ventana que tenga dos etiquetas y
//dos botones de operación. El comportamiento de la aplicación debe reflejar en el texto
//de las etiquetas el número de veces que el usuario ha hecho clic en cada uno de los
//botones.

package ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Ventana extends JFrame {

	private JPanel contentPane;

	int contador1 = 0;
	int contador2 = 0;
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
		
		JLabel etiquetaNombreAlumno = new JLabel("Carlos Alcaide S\u00E1nchez");
		etiquetaNombreAlumno.setBounds(10, 236, 140, 14);
		contentPane.add(etiquetaNombreAlumno);
		
		JLabel etiqueta1 = new JLabel("N\u00FAmero de clicks:");
		etiqueta1.setBounds(32, 105, 151, 34);
		contentPane.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("N\u00FAmero de clicks:");
		etiqueta2.setBounds(238, 105, 146, 34);
		contentPane.add(etiqueta2);
		
		JButton botonSumar1 = new JButton("A\u00F1adir a etiqueta 1");
		botonSumar1.setBounds(32, 37, 151, 34);
		contentPane.add(botonSumar1);
		botonSumar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
					contador1 ++;
					etiqueta1.setText("Número de clicks: " + contador1);
			}
		});
		
		JButton botonSumar2 = new JButton("A\u00F1adir a etiqueta 2");
		botonSumar2.setBounds(238, 37, 146, 34);
		contentPane.add(botonSumar2);
		botonSumar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent d) {
								
					contador2 ++;
					etiqueta2.setText("Número de clicks: " + contador2);
			}
		});
		
		JLabel etiquetaEncabezado = new JLabel("Pulsa los botones");
		etiquetaEncabezado.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaEncabezado.setBounds(162, 12, 118, 14);
		contentPane.add(etiquetaEncabezado);
	}
}
