package ud5;

import javax.swing.JOptionPane;

public class ud5_11_app {
	public static void main(String[] args) {

		String dia = JOptionPane.showInputDialog("d�a de la semana");

		switch (dia) {
		case "Lunes":
		case "Martes":
		case "Mi�rcoles":
		case "Jueves":
		case "Viernes":
		case "S�bado":
			System.out.println("Hoy es d�a laboral " + dia);
			break;
		case "Domingo":
			System.out.println("Hoy es d�a festivo " + dia);
			break;
		default:
			System.out.println("d�a de la semana");
		}
	}
}
