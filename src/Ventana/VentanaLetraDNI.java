package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


/*
 * By Paco Gomez
 * Esta ventana tendrá dos JTextFields
 * El primero recojerá el DNI
 * El segundo calculará la letra al apretar el botón
 * 
 * */
public class VentanaLetraDNI extends JFrame {

	private JPanel contentPane;
	private JTextField recojeDNI;
	private JTextField dniCalculado;



	/**
	 * Create the frame.
	 */
	public VentanaLetraDNI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JLabel IntroduceDNI = new JLabel("Introduce DNI");
		contentPane.add(IntroduceDNI);
		
		recojeDNI = new JTextField();
		contentPane.add(recojeDNI);
		recojeDNI.setColumns(10);
		
		JLabel lblLetraDniCalculada = new JLabel("Letra DNI Calculada");
		contentPane.add(lblLetraDniCalculada);
		
		dniCalculado = new JTextField();
		dniCalculado.setEditable(false);
		contentPane.add(dniCalculado);
		dniCalculado.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		contentPane.add(btnCalcular);
	}

}
