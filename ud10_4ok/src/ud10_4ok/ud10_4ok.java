package ud10_4ok;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class ud10_4ok {

	// Declaramos las variables //
	public int sumar(int num1, int num2) {
		return num1 + num2;
	}

	public static int restar(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static int divivir(int num1, int num2) {
		return num1 / num2;
	}

	public static double potencia(int num1, int num2) {
		return (double) Math.pow(num1, num2);
	}

	public static double raizCuadrada(int num1) {
		return (double) Math.sqrt(num1);
	}

	public static double raizCubica(int num1) {
		return (double) Math.cbrt(num1);
	}

	public static void main(String[] args) {

		// Paradigma POO //
		try {
			String texto = JOptionPane.showInputDialog("Introduce el primer número: ");
			System.out.println("Valor del primer número: " + texto);
			int num1 = Integer.parseInt(texto);

			String texto1 = JOptionPane.showInputDialog("Introduce el segundo número: ");
			System.out.println("Valor del segundo número: " + texto1);
			int num2 = Integer.parseInt(texto1);

			int suma = num1 + num2;
			int resta = num1 - num2;
			int multiplicacion = num1 * num2;
			int division = num1 / num2;
			double raizCuadrada = Math.sqrt(num1);
			double raizCuadrada2 = Math.sqrt(num2);
			double raizCubica = Math.cbrt(num1);
			double potencia = Math.pow(num1, num2);

			System.out.println("El resultado de la suma de: " + texto + " + " + texto1 + " es: " + suma);
			System.out.println("El resultado de la resta de: " + texto + " - " + texto1 + " es: " + resta);
			System.out.println(
					"El resultado de la multiplicación de: " + texto + " * " + texto1 + " es: " + multiplicacion);
			System.out.println("El resultado de la división de: " + texto + " / " + texto1 + " es: " + division);
			System.out.println(
					"El resultado de la potencia de: " + texto + " a la " + texto1 + " es: " + Math.pow(num1, num2));
			System.out.println("El resultado de la raiz cuadrada de: " + texto + " es: " + Math.sqrt(num1));
			System.out.println("El resultado de la raiz cuadrada de: " + texto1 + " es: " + Math.sqrt(num2));
			System.out.println("El resultado de la raiz cubica de: " + texto + " es: " + Math.cbrt(num1));
			System.out.println("El resultado de la raiz cubica de: " + texto1 + " es: " + Math.cbrt(num2));

		} catch (InputMismatchException e) {
			System.out.print("¡Solo se aceptan números!");
		}
		;
	}

}