package vjezba_1;
import java.util.Scanner;

/*Narcissistic Number je broj čija suma cifara (tog broja) stepenova sa njegovim brojem cifara daje isti taj broj.
 * Vaš program treba da štampa “Da” ili “Ne” u zavisnosti od toga da li je broj Narcissistic ili nije. Input je uvijek validan broj.\*/

public class ZadatakTridesetOsam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int broj = sc.nextInt();
		
		provjeraBroja(broj);
		
		sc.close();
	}
	
	private static void provjeraBroja(int broj) {
		
		String sBroj = Integer.toString(broj);
		
		int suma = 0;
		int brojCifara = sBroj.length();
		
		for (char a : sBroj.toCharArray()) {
			
			suma += Math.pow(Character.getNumericValue(a), brojCifara);
			
		}
		
		if (suma == broj)
			System.out.printf("Broj %d je narcissitic number.", broj);
		
		else
			System.out.printf("Broj %d nije narcissitic number.", broj);
		
	}

}
