package ejercicio6;

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
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Ventana6 extends JFrame {

	private JPanel contentPane;
	private JTextField campoPelicula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana6 frame = new Ventana6();
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
	public Ventana6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiquetaEncabezado = new JLabel("Escribe el t\u00EDtulo de una pel\u00EDcula");
		etiquetaEncabezado.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaEncabezado.setBounds(10, 11, 207, 33);
		contentPane.add(etiquetaEncabezado);
		
		JLabel etiquetaNombreAlumno = new JLabel("Carlos Alcaide S\u00E1nchez");
		etiquetaNombreAlumno.setBounds(10, 236, 177, 14);
		contentPane.add(etiquetaNombreAlumno);
		
		campoPelicula = new JTextField();
		campoPelicula.setBounds(10, 55, 177, 20);
		contentPane.add(campoPelicula);
		campoPelicula.setColumns(10);
		
		JComboBox comboPeliculas = new JComboBox();
		comboPeliculas.setBounds(10, 154, 207, 22);
		contentPane.add(comboPeliculas);
		
		JLabel etiquetaDisponibles = new JLabel("Pel\u00EDculas disponibles");
		etiquetaDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaDisponibles.setBounds(10, 126, 207, 14);
		contentPane.add(etiquetaDisponibles);
		
		JButton botonAdd = new JButton("A\u00F1adir");
		botonAdd.setBounds(216, 55, 89, 23);
		contentPane.add(botonAdd);
		botonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboPeliculas.addItem(campoPelicula.getText());
			}
		});
	}
}
