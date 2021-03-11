package ud10_5;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class EjecutableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Introducir tama�o del array de Passwords //
		String texto = JOptionPane.showInputDialog("Introduce un tama�o del array de Passwords");
		int tama�o = Integer.parseInt(texto);

		// Introducir la longitud de los Passwords //
		texto = JOptionPane.showInputDialog("Introduce la longitud de los Passwords");
		Password listaPassword[] = new Password[tama�o];
		boolean fuerzaPassword[] = new boolean[tama�o];
		try {
			for (int i = 0; i < listaPassword.length; i++) {
				listaPassword[i] = new Password();
				fuerzaPassword[i] = listaPassword[i].esFuerte();
				System.out.println(listaPassword[i].getContrase�a() + " " + fuerzaPassword);
			}
		} catch (InputMismatchException e) {
			System.out.print("Solo se aceptan n�meros");
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}