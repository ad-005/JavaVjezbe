package vjezba_1;
import java.util.Random;

/*Dobili ste zadatak da dešifrujete kod kojim se otvaraju tajna vrata. 
 * Otkrili ste da na osnovu poznatog trocifrenog broja možete pronaći 
 * kod koji otvara tajna vrata tako što od proizvoda cifara tog broja 
 * oduzmete zbir cifara istog broja.*/

public class ZadatakOsamnaest {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int trocifreniBroj = rand.nextInt(100, 1000);
		int proizvod = 1;
		int zbir = 0;
		
		String brojString = Integer.toString(trocifreniBroj);
		
		for (char x : brojString.toCharArray()) {
			zbir += Character.getNumericValue(x);
			proizvod *= Character.getNumericValue(x);
		}
		
		int sifra = proizvod - zbir;
		
		System.out.printf("Broj: %d\nProizvod cifara: %d\nZbir cifara: %d\nSifra: %d", trocifreniBroj, proizvod, zbir, sifra);
		
	}

}
