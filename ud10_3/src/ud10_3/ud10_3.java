package ud10_3;

public class ud10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Generando n�mero aleatorio...");
			int numero = (int) (Math.random() * 100);
			System.out.println(+numero);
			if (numero % 2 == 0) {
				throw new Exception("N�mero par");
			} else {
				throw new Exception("N�mero impar");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
	}
}
