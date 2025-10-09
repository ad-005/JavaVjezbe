package vjezba_1;
import java.util.Random;

/*Napisati program koji za zadati trocifreni broj računa zbir cifara tog broja.*/

public class zadatakSedamnaest {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int trocifreniBroj = rand.nextInt(100, 1000);
		String brojString = Integer.toString(trocifreniBroj);
		int zbir = 0;
		
		System.out.printf("Broj je: %d", trocifreniBroj);
		
		for (char broj : brojString.toCharArray()) {
			zbir += Character.getNumericValue(broj);
		}
		
		System.out.printf("\nZbir cifara broja %d: %d", trocifreniBroj, zbir);
		
	}

}
