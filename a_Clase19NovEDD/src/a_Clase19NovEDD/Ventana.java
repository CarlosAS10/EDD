package a_Clase19NovEDD;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField campoTexto;

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
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.RED, 6, true));
		panel.setForeground(Color.ORANGE);
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		
		JButton boton1 = new JButton("Pulsa");
		boton1.setBounds(28, 50, 102, 25);
		boton1.setForeground(Color.RED);
		boton1.setBackground(Color.WHITE);
		boton1.setFont(new Font("Segoe UI Black", Font.BOLD, 11));
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		panel.add(boton1);
		
		campoTexto = new JTextField();
		campoTexto.setBounds(140, 52, 226, 20);
		panel.add(campoTexto);
		campoTexto.setColumns(10);
	}
}
