package ud19;

import java.awt.Component;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class ud19_1 extends JFrame {
	public ud19_1() {

		JButton button = new JButton("New button");
		getContentPane().add(button, BorderLayout.SOUTH);
	}

	// Panel de la aplicaci�n //
	private JPanel contentPane;
	private javax.swing.JButton btnSaludar;
	private javax.swing.JTextField textFieldNombre;

	/**
	 * @wbp.parser.constructor
	 */
	public ud19_1(Component textField) {

		// A�adimos un titulo a la ventana //
		setTitle("Saludador");

		// Coordenadas x y de la aplicaci�n y su altura y longitud //
		setBounds(400, 200, 319, 227);

		// Indicamos que cuando se cierre la ventana se acaba la aplicaci�n //
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Hacemos visible la ventana //
		setVisible(true);

		// Creamos el panel //
		contentPane = new JPanel();

		// Indicamos su dise�o //
		contentPane.setLayout(null);

		// Asignamos el panel a la ventana //
		setContentPane(contentPane);

		// Creaci�n de componentes //
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		etiqueta.setBounds(60, 20, 200, 20);

		// Colocamos el componente //
		etiqueta.setBounds(70, 28, 173, 20);

		// A�adimos el elemento al panel //
		contentPane.add(etiqueta);

		// Campo de texto //
		textField = new JTextField();
		textField.setBounds(70, 78, 173, 26);
		contentPane.add(textField);

		// Bot�n y ventana emergente saludando //
		JButton boton = new JButton("�Saludar!");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog("�Hola!" + boton);
			}
		});
		boton.setBounds(104, 129, 89, 23);
		contentPane.add(boton);

	}

	public static void main(String[] args) {

	}
}
