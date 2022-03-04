package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField resultado;

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
		
		JLabel etiquetaCabecera = new JLabel("Introduce dos n\u00FAmeros enteros");
		etiquetaCabecera.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaCabecera.setBounds(119, 11, 186, 21);
		contentPane.add(etiquetaCabecera);
		
		num1 = new JTextField();
		num1.setBounds(71, 43, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(257, 43, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);
		
		JButton btnNewButton = new JButton("SUMAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				
				resultado.setText(Integer.toString(n1 + n2));
			}
		});
		btnNewButton.setBounds(164, 105, 89, 23);
		contentPane.add(btnNewButton);
		
		resultado = new JTextField();
		resultado.setBounds(219, 156, 86, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JLabel etiquetaResultado = new JLabel("Resultado: ");
		etiquetaResultado.setFont(new Font("Tahoma", Font.BOLD, 11));
		etiquetaResultado.setBounds(111, 159, 79, 14);
		contentPane.add(etiquetaResultado);
		
		JLabel nombreAlumno = new JLabel("Carlos Alcaide S\u00E1nchez");
		nombreAlumno.setBounds(10, 236, 147, 14);
		contentPane.add(nombreAlumno);
	}
}
