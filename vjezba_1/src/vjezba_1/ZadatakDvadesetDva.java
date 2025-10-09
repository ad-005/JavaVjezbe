package vjezba_1;
import java.util.Random;


/*U selu poznatom po svojim jabukama, održava se godišnje takmičenje u berbi jabuka između i najbliži pobjedi su Petar i Miloš. 
 * Petar tvrdi da je ubrao p jabuka, dok Miloš tvrdi da je ubrao m jabuka. 
 * Vaš zadatak je da kreirate program koji će provjeriti da li je Petar uspio da ubere više jabuka nego Miloš 
 * i shodno tome ispiše poruku o pobjedniku. 
 * Pretpostaviti da ne mogu ubrati isti broj jabuka.*/

public class ZadatakDvadesetDva {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int p = rand.nextInt(10, 26);
		int m = rand.nextInt(10, 26);
		
		System.out.printf("Petar: %d\nMilos: %d", p, m);
		
		if (p > m) {
			System.out.printf("\nPetar je ubrao vise jabuka.");
		}
		
		else {
			System.out.printf("\nMilos je ubrao vise jabuka.");
		}
	}

}
