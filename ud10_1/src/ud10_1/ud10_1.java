package ud10_1;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class ud10_1 {
	public static void main(String[] args) {

		int numRandom = (int) (Math.random() * 500);
		int num = 0;
		String texto = JOptionPane.showInputDialog("Introduce un n�mero del 1 al 500");

		do {
			boolean leido;
			do {
				System.out.println("Introduce un n�mero del 1 al 500: ");
				try {
					System.out.println("El n�mero introducido es " + texto);
					leido = true;
				} catch (InputMismatchException ex) {
					System.out.println(ex.getMessage());
					leido = false;
				}
			} while (leido == false);
			if (num > numRandom) {
				System.out.println("El n�mero es menor a " + texto);
			}
			if (num < numRandom) {
				System.out.println("El n�mero es mayor a " + texto);
			}
		} while (num != numRandom);
		System.out.println("Has acertado con el n�mero" + numRandom);
	}
}
