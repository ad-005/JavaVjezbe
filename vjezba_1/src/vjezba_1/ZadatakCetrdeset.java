package vjezba_1;
import java.util.Random;
import java.util.Scanner;

/*Na parking ulazi N automobila. 
 * Za svaki auto unosi se broj sati. 
 * Cijena je 2€ po satu, ali ako auto ostane duže od 5 sati, od šestog sata cijena je 1€. 
 * Program računa ukupnu zaradu.*/

public class ZadatakCetrdeset {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int brojAuta = sc.nextInt();
		
		ukupnaZarada(brojAuta);

		sc.close();
	}
	
	private static void ukupnaZarada(int brojAuta) {
		
		Random rand = new Random();
		
		double zarada = 0;
		
		double bonusPrekoSati = 5;
		double cijenaPoSatu = 2;
		double cijenaDuzeOdBonus = 1;
		
		for (int i = 0; i < brojAuta; i++) {
			
			double brojSati = rand.nextDouble(1, 10);
			
			if (brojSati > bonusPrekoSati) {
				zarada += (bonusPrekoSati * cijenaPoSatu) + (brojSati - bonusPrekoSati) * cijenaDuzeOdBonus;
			}
			
			else
				zarada += brojSati * cijenaPoSatu;
			
			System.out.printf("%nAuto %d | Broj sati: %.2f", i + 1, brojSati);
		}
		
		System.out.printf("%nUkupna zarada od %d parkiranih auta iznosi: %.2f.", brojAuta, zarada);
		
	}

}
