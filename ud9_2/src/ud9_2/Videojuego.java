package ud9_2;

/**
 * Clase Videojuego
 * 
 * @author Emmapago
 */

public class Videojuego implements Entregable {

	// Constantes
	private final static int HORAS_ESTIMADAS = 100;
	public final static int MAYOR = 1;
	public final static int MENOR = -1;
	public final static int IGUAL = 0;

	// Atributos//
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private static String compa�ia;

	// Get y set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public boolean isEntregado1() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return entregado;

	}

	@Override
	public boolean compareTo(Object a) {
		Videojuego ref = (Videojuego) a;
		if (horasEstimadas > ref.getHorasEstimadas()) {
		} else if (horasEstimadas == ref.getHorasEstimadas()) {
		}
		return entregado;
	}

	// Constructor
	public Videojuego() {
		this(compa�ia, HORAS_ESTIMADAS, compa�ia, compa�ia);
	}

	public Videojuego(String titulo, String compa�ia) {
		this(titulo, HORAS_ESTIMADAS, compa�ia, compa�ia);
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
		this.entregado = false;

	}
}
