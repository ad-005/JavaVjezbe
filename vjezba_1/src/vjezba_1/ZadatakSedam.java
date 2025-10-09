package vjezba_1;
import java.util.Scanner;

/*Marko voli biciklizam. Pošto Marko zna da je važno biti hidratizovan, 
 * pije vodu na svakih sat vremena vožnje bicikla i to pola litara vode. 
 * Kao ulaz poznato je vrijeme u satima, 
 * a treba štampati broj litara koje će Marko popiti, zaokruženo na najmanju vrijednost (donje cijelo).
Primjer: time = 3 ----> litara = 1; time = 6.7---> litara = 3 ; time = 11.8--> litara = 5.*/

public class ZadatakSedam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double vrijeme = sc.nextDouble();
		int kolicinaVode = (int) (vrijeme * 0.5);
		
		System.out.printf("Kolicina vode potrosena za %.2f sati voznje iznosi %dL", vrijeme, kolicinaVode);
		
		sc.close();
		
	}

}
