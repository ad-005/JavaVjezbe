package vjezba_1;
import java.util.Random;

/*Napisati program kojim se na osnovu datog prosjeka učenika prikazuje uspjeh učenika. 
 * Odličan uspjeh ima učenik čiji je prosjek veći ili jednak 4.5. 
 * Vrlodobar uspeh postiže učenik čiji je prosek veći ili jednak 3.5, a manji od 4.5, 
 * dobar uspeh se postiže za prosek koji je veći ili jednak 2.5 a manji od 3.5, dovoljan uspeh za prosek veći ili jednak 2, a manji od 2.5. 
 * Ako učenik ima neku jedinicu unijeće se prosjek 1, a uspeh mu je nedovoljan.*/

public class ZadatakTridesetJedan {

	public static void main(String[] args) {

		Random rand = new Random();
		
		double prosjek = rand.nextDouble(6);
		System.out.printf("Prosjek: %.2f%n", prosjek);
		
		dodjelaProsjeka(prosjek);

	}
	
	private static void dodjelaProsjeka(double prosjek) {
		
		if (prosjek >= 4.5)
			System.out.print("Odlican.");
		
		else if (3.5 <= prosjek && prosjek < 4.5)
			System.out.print("Vrlodobar.");
		
		else if (2.5 <= prosjek && prosjek < 3.5)
			System.out.print("Dobar.");
		
		else if (2 <= prosjek && prosjek < 2.5)
			System.out.print("Dovoljan.");
		
		else
			System.out.printf("Nedovoljan.");
	}

}
