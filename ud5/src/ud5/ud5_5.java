package ud5;
import javax.swing.JOptionPane;
public class ud5_5 {
	public static void main (String []args) {
		
		String texto=JOptionPane.showInputDialog("numero");
		int numero=Integer.parseInt(texto);

		if(numero%2==0){
			System.out.println("El n�mero "+numero+"es divisible entre 2");
		}else {
			System.out.println("El n�mero "+numero+" no es divisible entre 2");
		}
	}
}
