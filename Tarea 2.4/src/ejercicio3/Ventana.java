package ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ventana extends JFrame {

	private JPanel contentPane;

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
		
		JRadioButton radioLunes = new JRadioButton("Lunes");
		radioLunes.setBounds(6, 53, 109, 23);
		contentPane.add(radioLunes);
		
		JRadioButton radioMartes = new JRadioButton("Martes");
		radioMartes.setBounds(6, 91, 109, 23);
		contentPane.add(radioMartes);
		
		JRadioButton radioMiercoles = new JRadioButton("Mi\u00E9rcoles");
		radioMiercoles.setBounds(6, 133, 109, 23);
		contentPane.add(radioMiercoles);
		
		JRadioButton radioJueves = new JRadioButton("Jueves");
		radioJueves.setBounds(6, 178, 109, 23);
		contentPane.add(radioJueves);
		
		JRadioButton radioViernes = new JRadioButton("Viernes");
		radioViernes.setBounds(176, 72, 109, 23);
		contentPane.add(radioViernes);
		
		JRadioButton radioSabado = new JRadioButton("S\u00E1bado");
		radioSabado.setBounds(176, 114, 109, 23);
		contentPane.add(radioSabado);
		
		JRadioButton radioDomingo = new JRadioButton("Domingo");
		radioDomingo.setBounds(176, 158, 109, 23);
		contentPane.add(radioDomingo);
		
		JLabel etiquetaEncabezado = new JLabel("\u00BFQu\u00E9 d\u00EDa es hoy?");
		etiquetaEncabezado.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaEncabezado.setBounds(10, 11, 126, 14);
		contentPane.add(etiquetaEncabezado);
		
		JButton botonListo = new JButton("LISTO");
		botonListo.setFont(new Font("Tahoma", Font.BOLD, 11));
		botonListo.setBounds(309, 114, 89, 23);
		contentPane.add(botonListo);
		
		JLabel etiquetaNombre = new JLabel("Carlos Alcaide S\u00E1nchez");
		etiquetaNombre.setBounds(6, 236, 159, 14);
		contentPane.add(etiquetaNombre);
		botonListo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (radioLunes.isSelected()) {
					
					JOptionPane.showMessageDialog(null, "Hoy es Lunes.");
				}
				
					else if (radioMartes.isSelected()) {
					
						JOptionPane.showMessageDialog(null, "Hoy es Martes.");
					}
				
						else if (radioMiercoles.isSelected()) {
							
							JOptionPane.showMessageDialog(null, "Hoy es Miércoles.");
						}
				
							else if (radioJueves.isSelected()) {
								
								JOptionPane.showMessageDialog(null, "Hoy es Jueves.");
							}
				
								else if (radioViernes.isSelected()) {
									
									JOptionPane.showMessageDialog(null, "Hoy es Viernes.");
								}
				
									else if (radioSabado.isSelected()) {
										
										JOptionPane.showMessageDialog(null, "Hoy es Sábado.");
									}
				
										else if (radioDomingo.isSelected()) {
											
											JOptionPane.showMessageDialog(null, "Hoy es Domingo.");
										}
				
											else {
												
												JOptionPane.showMessageDialog(null, "No has seleccionado ningún día.");
											}
			}
		});
	}
}
