package vjezba_1;
import java.util.Random;

/*U tajanstvenom svijetu postoji portal koji se otvara samo kada mu se date paran broj. 
 * Kao mladi čarobnjak na svom prvom zadatku, dobio si čarobni štapić koji može generisati brojeve. 
 * Vaš zadatak je da kreirate program koji će provjeriti da li je broj koji je čarobni štapić generisao paran. 
 * Ako jeste, algoritam treba da ispiše: "Portal se otvara!" Ako nije, algoritam treba da ispiše: "Portal ostaje zatvoren."*/

public class ZadatakDvadesetJedan {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int broj = rand.nextInt(100);
		System.out.println("\n" + broj);
		
		if (broj % 2 != 0) {
			System.err.print("Portal ostaje zatvoren.");
		}
		
		else {
			System.out.print("Portal se otvara.");
		}
		
	}

}
