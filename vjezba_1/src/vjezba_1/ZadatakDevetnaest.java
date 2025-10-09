package vjezba_1;
import java.util.Random;

/*Otkrili ste algoritam kojim možete doći do šifre koja otvara sef. U sefu se nalazi knjiga koja krije tajne o nastanku univerzuma. 
 * Šifra se dobija kada se od kvadrata zbira prve i poslednje cifre četvorocifrenog broja oduzme razlika kvadrata druge i trece cifre.*/

public class ZadatakDevetnaest {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int cetBroj = rand.nextInt(1000, 10000);
		String brojString = Integer.toString(cetBroj);
		
		int kvadratZbira = (int) Math.pow(Character.getNumericValue(brojString.charAt(brojString.length() - 1)) + Character.getNumericValue(brojString.charAt(0)), 2);
		int razlikaKvadrata = (int) Math.pow(Character.getNumericValue(brojString.charAt(1)), 2) - (int) Math.pow(Character.getNumericValue(brojString.charAt(2)), 2);
		
		int sifra = kvadratZbira - razlikaKvadrata;
		
		System.out.printf("Broj: %d\nKvadrat zbira: %d\nRazlika kvadrata: %d\n\nSifra: %d", cetBroj, kvadratZbira, razlikaKvadrata, sifra);
		
	}

}
