package vjezba_1;
import java.util.Random;
import java.util.Scanner;

/*Zamislite da se u ravni nalazi dron na poziciji (x, y). 
 * Na različitim koordinatama (xi,yi) nalaze se paketi koje dron može da pokupi. 
 * Za N paketa poznate su njihove koordinate (xi,yi). 
 * Potrebno je izračunati ukupnu udaljenost koju bi dron morao da pređe od baze (x, y) do tih paketa (zbir svih udaljenosti), 
 * ali samo za pakete koji se nalaze u prvom kvadrantu (sjeveroistočna zona grada). 
 * Napomena: dron uvijek kreće od pozicije (x, y).*/

public class ZadatakCetrdesetJedan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite pocetne koordinate drona. Prvo X, pa Y. [Napomena: Morate stisnuti ENTER izmedju unosa koordinata.]");
		double xDrona = sc.nextDouble(), yDrona = sc.nextDouble();
		
		System.out.print("Unesite broj paketa: ");
		int brojPaketa = sc.nextInt();

		udaljenostPaketa(xDrona, yDrona, brojPaketa);
		
		sc.close();
		
	}

	private static void udaljenostPaketa(double xDrona, double yDrona, int brojPaketa) {
		
		Random rand = new Random();
		double ukupnaDistanca = 0;
		
		for (int i = 0; i < brojPaketa; i++) {
			
			double xPaketa = rand.nextDouble(51), yPaketa = rand.nextDouble(51);
			
			if (xPaketa > 0 && yPaketa > 0)
				ukupnaDistanca += Math.hypot(xPaketa - xDrona, yPaketa - yDrona);
			
		}
		
		System.out.printf("%nUkupna distanca koju dron mora preci da bi pokupio sve pakete: %.2f jedinica.", ukupnaDistanca);
		
	}
	
}
