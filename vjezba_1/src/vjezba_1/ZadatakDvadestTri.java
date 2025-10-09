package vjezba_1;
import java.util.Random;

/*Zamislite da pravite program koji treba da odluči da li student može da pristupi ispitu. 
 * Postoje dva uslova: student mora imati više od 75% prisustva na predavanjima i mora imati predate sve seminarske radove. 
 * Oba uslova moraju biti zadovoljena da bi student mogao pristupiti ispitu. Algoritam treba da štampa odgovarajuću poruku. 
 * Dodatak: prisustvo se unosi u procentima, a dio za seminarske radove na sledeci nacin -> 0 predstavlja da 
 * bar jedan seminarski rad nije uradjen, a 1 da su svi seminarski radovi uradjeni.*/

public class ZadatakDvadestTri {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int seminarskiStatus = rand.nextInt(2);
		int prisustvo = rand.nextInt(101);
		
		System.out.printf("Seminarski status: %d\nPrisustvo %d%%", seminarskiStatus, prisustvo);
		
		if (seminarskiStatus != 0 && prisustvo > 75) {
			System.out.print("\nMozete pristupiti ispitu.");
		}
		
		else {
			System.out.print("\nNe mozete pristupiti ispitu.");
		}

	}

}
