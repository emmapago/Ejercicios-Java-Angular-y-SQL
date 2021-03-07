import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ud20_3 extends JFrame {

	public static void main(String[] args) {
	}

	private JPanel contentPane;
	private JTextField respuesta1;
	private JTextField textField;

	public ud20_3() {

		// A�adimos un titulo a la ventana //
		setTitle("Ventana con m�s interacci�n");

		// Coordenadas x y de la aplicaci�n y su altura y longitud //
		setBounds(400, 200, 409, 129);

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

		// Etiqueta 1 //
		JLabel Etiqueta1 = new JLabel("Bot�n 1: ");
		Etiqueta1.setBounds(49, 11, 72, 14);
		contentPane.add(Etiqueta1);

		// Etiqueta 2//
		JLabel Etiqueta2 = new JLabel("Bot�n 2: ");
		Etiqueta2.setBounds(241, 11, 72, 14);
		contentPane.add(Etiqueta2);

		// Bot�n 1 //
		JButton boton1 = new JButton("Bot�n 1");
		boton1.addActionListener(new ActionListener() {
			private int count;
			private AbstractButton etiqueta;

			public void actionPerformed(ActionEvent e) {
				count++;
				etiqueta.setText(Integer.toString(count));
			}
		});
		boton1.setBounds(49, 36, 89, 23);
		contentPane.add(boton1);

		// Bot�n 2 //
		JButton boton2 = new JButton("Bot�n 2");
		boton2.addActionListener(new ActionListener() {
			private int count1;
			private AbstractButton etiqueta;

			public void actionPerformed(ActionEvent e) {
				count1++;
				etiqueta.setText(Integer.toString(count1));
			}
		});
		boton2.setBounds(241, 36, 89, 23);
		contentPane.add(boton2);

	}
}