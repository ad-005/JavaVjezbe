package vjezba_1;
import java.util.Random;

/*Vaš zadatak je da napišete program kojim provjeravate da li je strelica pogodila pikado tablu. 
 * Za pikado tablu je poznat je njegov poluprečnik i koordinate centra, a za strelice koordinate cilja.*/

public class ZadatakTrideset {

	public static void main(String[] args) {

		Random rand = new Random();
		
		double xCentra = rand.nextDouble(5, 21), yCentra = rand.nextDouble(5, 21);
		double xCilja = rand.nextDouble(41), yCilja = rand.nextDouble(41);
		
		double poluprecnik = rand.nextDouble(5, 16);
		
		System.out.printf("xC: %.2f\nyC: %.2f\n\nPoluprecnik: %.2f\n\nxP: %.2f\nyP: %.2f", xCentra, yCentra, poluprecnik, xCilja, yCilja);
		
		PogodakTable(xCentra, yCentra, xCilja, yCilja, poluprecnik);
		
	}
	
	private static void PogodakTable(double xCentra, double yCentra, double xCilja, double yCilja, double poluprecnik) {
		
		double distancaCilja = Math.hypot(xCilja - xCentra, yCilja - yCentra);
		
		if (distancaCilja <= poluprecnik) {
			System.out.printf("\n\nPikado tabla pogodjena.");
		}
		
		else {
			double promasaj = distancaCilja - poluprecnik;
			System.out.printf("\n\nStrelica je promasila tablu za %.2f jedinica.", promasaj);
		}
		
	}

}
