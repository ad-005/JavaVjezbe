package vjezba_1;
import java.util.Random;

/*Zamislite da ste dobili pismo sa mapom i uputstvima za pronalaženje skrivenog blaga. 
 * Uputstva su sljedeća: 
 * "Trebate da krenete od starog hrasta koji ima sledeću poziciju G (x1,y1). 
 * Onda trebate ići pravo do stare kuće koja se nalazi na poziciji K(x2,y2). 
 * Blago je zakopano u susjedstvu, gdje se nalazi kuća, 
 * i to desno od pozicije kuće za dvije pozicije, i ispod za tri pozicije.
 * 
 *  a. Izračunajte koordinate blaga.
 *  b. Izračunajte (vazdušno) rastojanje od hrasta do blaga.
 *  c. Izračunajte rastojanje od hrasta do blaga tako da morate obići i kuću.
 *  */

public class ZadatakTrinaest {

	public static void main(String[] args) {

		Random rand = new Random();
		
		double x1 = rand.nextDouble(10), y1 = rand.nextDouble(10), x2 = rand.nextDouble(10, 26), y2 = rand.nextDouble(10, 26);
		double x3 = x2 + 2, y3 = y2 - 3; // a
		
		System.out.printf("Hrast: (%.2f, %.2f)\nKuca: (%.2f, %.2f)\nBlago: (%.2f, %.2f)", x1, y1, x2, y2, x3, y3);
		
		double hrastBlago = Math.hypot(x3 - x1, y3 - y1); // b
		double hrastKucaBlago = Math.hypot(x2 - x1, y2 - y1) + Math.hypot(x3 - x2, y2 - y3); // c
		
		System.out.printf("\n\nKoordinate blaga: (%.2f, %.2f)\nHrast -> Blago: %.2f\nHrast -> Kuca -> Blago: %.2f", x3, y3, hrastBlago, hrastKucaBlago);
		
	}

}
