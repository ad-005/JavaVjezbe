package vjezba_1;
import java.util.Scanner;

/*Kućni red zabranjuje pravljenje buke prije 6 časova, između 13 i 17 časova i nakon 22 časa. 
 * Napiši program koji radnicima govori da li u nekom datom trenutku mogu da izvode bučnije radove.*/

public class ZadatakDvadesetPet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int vrijemeDana = sc.nextInt();
		
		if (vrijemeDana < 6 || (13 <= vrijemeDana && vrijemeDana < 17) || vrijemeDana > 22) {
			System.out.print("Ne smijete izvoditi bucnije radove.");
		}
		
		else {
			System.out.print("Smijete izvoditi bucnije radove.");
		}
		
		sc.close();
		
	}

}
