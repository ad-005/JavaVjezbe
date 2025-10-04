package vjezba_1;
import java.util.Random;
import java.util.Scanner;

/*Vaš zadatak je da napišete program kojim ćete prebrojati koliko mrava se kreće po ivici stola. 
 * Geometrijski, mrav se predstavlja kao tačka, a za sto su poznate tjemena desne gornje i lijeve donje ivice stola. 
 * Smatrati da je sto pravouganik, ne kvadar.*/

public class ZadatakTridesetDevet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite ukupan broj mrava: ");
		int ukupnoMrava = sc.nextInt();
		
		brojMrava(ukupnoMrava);
		
		sc.close();
	}
	
	private static void brojMrava(int ukupnoMrava) {
		
		Random rand = new Random();
		int sumaMrava = 0;
		int xStolaD = rand.nextInt(16, 36), yStolaD = rand.nextInt(16, 36), xStolaL = rand.nextInt(16), yStolaL = rand.nextInt(16);
		
		
		for (int i = 0; i < ukupnoMrava; i++) {
			
			int xMrava = rand.nextInt(36);
			int yMrava = rand.nextInt(36);
			
			if (((yMrava == yStolaD || yMrava == yStolaL) && (xStolaL <= xMrava && xMrava <= xStolaD)) || ((xMrava == xStolaD || xMrava == xStolaL) && (yStolaL <= yMrava && yMrava <= yStolaD))) {
				System.out.printf("%nMrav (%d, %d) se krece po ivici stola.", xMrava, yMrava);
				sumaMrava += 1;
			}
			
			else
				System.out.printf("%nMrav (%d, %d) se ne krece po ivici stola.", xMrava, yMrava);
				
		}
		
		System.out.printf("%nUkupan broj mrava koji se krecu po ivici stola: %d", sumaMrava);
	}

}
