package vjezba_1;
import java.util.Random;
import java.util.Scanner;

/*Za N domaćinstava unosi se mjesečna potrošnja struje (kWh). 
 * Računati ukupnu potrošnju i posebno zbir za ona domaćinstva čija je potrošnja > 500 kWh.*/

public class ZadatakTridesetCetiri {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj domacinstava: ");
		int brojDomacinstava = sc.nextInt();

		kalkulator(brojDomacinstava);
		
	}
	
	private static void kalkulator(int brojDomacinstava) {
		
		Random rand = new Random();
		
		double zbirVecihOd500 = 0;
		double zbirSvih = 0;
		
		for (int i = 0; i < brojDomacinstava; i++) {
				double potrosnja = rand.nextDouble(100, 701);
				System.out.printf("%nDomacinstvo br. %d: %.2f", i + 1, potrosnja);
				
				if (potrosnja > 500)
					zbirVecihOd500 += potrosnja;
				
				zbirSvih += potrosnja;
		}
		
		System.out.printf("%n%nUkupna potrosnja svih domacinstava: %.2f%nPotrosnja domacinstava > 500kWh: %.2f", zbirSvih, zbirVecihOd500);
		
	}

}
