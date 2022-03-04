package ejercicio2;

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

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField campoNomIntroducido;

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
		
		JLabel etiquetaEncabezado = new JLabel("Introduce tu nombre:");
		etiquetaEncabezado.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaEncabezado.setBounds(10, 46, 134, 14);
		contentPane.add(etiquetaEncabezado);
		
		JLabel etiquetaNombre = new JLabel("Carlos Alcaide S\u00E1nchez");
		etiquetaNombre.setBounds(10, 236, 134, 14);
		contentPane.add(etiquetaNombre);
		
		campoNomIntroducido = new JTextField();
		campoNomIntroducido.setBounds(148, 43, 213, 20);
		contentPane.add(campoNomIntroducido);
		campoNomIntroducido.setColumns(10);
		
		JButton botonListo = new JButton("LISTO");
		botonListo.setFont(new Font("Tahoma", Font.BOLD, 11));
		botonListo.setBounds(199, 74, 89, 23);
		contentPane.add(botonListo);
		botonListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Buenos días, " + campoNomIntroducido.getText());			}
		});
	}
}
