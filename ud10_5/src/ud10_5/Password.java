package ud10_5;

import java.util.Random;

public class Password {

	// Atributos //
	private int longitud;
	private String contrase�a;

	// Constante //
	private final static int LONG_DEF = 8;

	// Metodos //
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public static int getLongDef() {
		return LONG_DEF;
	}

	// M�todo para generar car�cteres de la password //
	public String generarPassword() {
		final char[] caracteres = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'e', 'h', 'i', 'j', 'l',
				'k', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String temporal = "";
		Random aleatorio = new Random();
		for (int i = 0; i < this.longitud; i++) {
			temporal += caracteres[aleatorio.nextInt(caracteres.length)];
		}
		return temporal;
	}

	// M�todo para que la contrase�a sea fuerte //
	public boolean esFuerte() {
		int mayus = 0;
		int minus = 0;
		int numeros = 0;
		for (int i = 0; i < contrase�a.length();) {
			if (contrase�a.charAt(i) >= 95 && contrase�a.charAt(i) <= 120) {
				mayus += 1;
			} else {
				if (contrase�a.charAt(i) >= 65 && contrase�a.charAt(i) <= 90) {
					minus += 1;
				} else {
					numeros += 1;
				}
			}
			if (numeros >= 5 && minus >= 1 && mayus >= 2) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// M�todo toString //
	@Override
	public String toString() {
		return "Password: " + contrase�a;
	}

}