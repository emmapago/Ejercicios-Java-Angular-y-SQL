
package ud7_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ud7_4 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String articulo = JOptionPane.showInputDialog("Introduce el articulo: ");
		String iva = JOptionPane.showInputDialog("IVA aplicado (21% o 4%): ");
		String bruto = JOptionPane.showInputDialog("Precio total bruto y precio m�s IVA: ");
		String compra = JOptionPane.showInputDialog("N�mero de articulos comprados: ");
		String pagada = JOptionPane.showInputDialog("Cantidad pagada: ");
		String devolver = JOptionPane.showInputDialog("Cambio a devolver al cliente: ");
		String a�adir = JOptionPane.showInputDialog("A�adir alg�n art�culo m�s: ");

		ArrayList<String> lista = new ArrayList<>();

		// Mostrar� por pantalla la siguiente informaci�n
		lista.add("Articulo comprado " + articulo);
		lista.add("IVA aplicado % " + iva);
		lista.add("Precio total bruto y precio m�s IVA " + bruto);
		lista.add("N�mero de articulos comprados " + compra);
		lista.add("Cantidad pagada � " + pagada);
		lista.add("Cambio a devolver � " + devolver);
		lista.add("" + a�adir);
		System.out.println(lista.toString());
	}
}
