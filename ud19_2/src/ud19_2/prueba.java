package ud19_2;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prueba extends JFrame {

	public static void main(String[] args) {
		prueba ventana = new prueba(null);
	}

	private JPanel contentPane;
	private AbstractButton textFieldNombre;
	JComboBox cmbPeliculas;

	public prueba(JTextField txtPeliculas) {

		// A�adimos un titulo a la ventana //
		setTitle("Pel�culas");

		// Coordenadas x y de la aplicaci�n y su altura y longitud //
		setBounds(400, 200, 462, 223);

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
		JLabel etiqueta = new JLabel("Escribe el t�tulo de una pel�cula:");
		etiqueta.setHorizontalAlignment(SwingConstants.LEFT);
		etiqueta.setBounds(20, 28, 212, 20);

		// Colocamos el componente //
		etiqueta.setBounds(70, 28, 173, 20);

		// A�adimos el elemento al panel //
		contentPane.add(etiqueta);

		// Campo de texto para escribir el nombre de la pel�cula //
		txtPeliculas = new JTextField();
		txtPeliculas.setBounds(49, 79, 173, 26);
		contentPane.add(txtPeliculas);

		// Bot�n a�adir //
		JButton btnPulsame = new JButton("A�adir");

		// Bot�n para a�adir las pel�culas al desplegable //
		btnPulsame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pelicula = btnPulsame.getText();
				cmbPeliculas.addItem(pelicula);
				JOptionPane.showMessageDialog(btnPulsame, e);
			}
		});
		btnPulsame.setBounds(93, 126, 89, 23);
		contentPane.add(btnPulsame);

		// Bot�n pel�culas //
		JLabel lblNewLabel = new JLabel("Pel�culas");
		lblNewLabel.setBounds(307, 31, 79, 14);
		contentPane.add(lblNewLabel);

		JComboBox cmbPeliculas = new JComboBox();
		cmbPeliculas.setBounds(265, 81, 133, 22);
		contentPane.add(cmbPeliculas);
		cmbPeliculas.addItem(etiqueta);

		setVisible(true);
	}
}
