package vjezba_1;
import java.util.Random;

/*Napisati program koji računa zbir parnih i proizvod neparnih brojeva od 1 do n. Broj n unosi korisnik.*/

public class ZadatakTridesetDva {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int broj = rand.nextInt(0, 51);
		System.out.printf("Broj: %d%n%n", broj);
		
		racunRaspona(broj);
		
	}
	
	private static void racunRaspona(int broj) {
		
		long zbir = 0;
		long proizvod = 1;
		
		for (int i = 1; i <= broj; i++) {
			
			if (i % 2 == 0)
				zbir += i;
			
			else
				proizvod *= i;
		}
		
		System.out.printf("Proizvod neparnih brojeva od 1 do %d je: %d.%nZbir parnih brojeva od 1 do %d je: %d.", broj, proizvod, broj, zbir);
		
	}

}
