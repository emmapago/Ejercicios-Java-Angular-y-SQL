package ud9_3;

public class ud9_3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro(1, "Crep�sculo", "Stephenie Meyer", 498);
		Libro libro2 = new Libro(2, "Amanecer", "Stephenie Meyer", 500);

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("Este libro tiene m�s p�ginas " + libro1.getTitulo());
		} else {
			System.out.println("Este libro tiene m�s p�ginas " + libro2.getTitulo());
		}
	}

}
