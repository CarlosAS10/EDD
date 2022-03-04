//Crea una ventana que pida un número de tipo entero. Al pulsar un botón
//debe mostrar un mensaje indicando si el número introducido es par o impar.

package ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana5 extends JFrame {

	private JPanel contentPane;
	private JTextField campoNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana5 frame = new Ventana5();
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
	public Ventana5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiquetaNombreAlumno = new JLabel("Carlos Alcaide S\u00E1nchez");
		etiquetaNombreAlumno.setBounds(10, 236, 140, 14);
		contentPane.add(etiquetaNombreAlumno);
		
		JLabel etiquetaEnunciado = new JLabel("Introduce un n\u00FAmero entero:");
		etiquetaEnunciado.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaEnunciado.setBounds(10, 56, 183, 14);
		contentPane.add(etiquetaEnunciado);
		
		campoNumero = new JTextField();
		campoNumero.setBounds(216, 53, 86, 20);
		contentPane.add(campoNumero);
		campoNumero.setColumns(10);
		
		JButton botonAnalizar = new JButton("ANALIZAR");
		botonAnalizar.setBounds(203, 102, 111, 30);
		contentPane.add(botonAnalizar);
		botonAnalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(campoNumero.getText());
				
				JOptionPane.showMessageDialog(null, "El número es " + (n1 % 2 == 0 ? "par" : "impar"));
			}
		});
	}

}
