package vjezba_1;
import java.util.Scanner;

/*Napisati program koji od korisnika traži da unese jedan cijeli broj. 
 * Program treba da odredi: da li je broj paran ili neparan, da li je broj pozitivan ili negativan (nulu tretirati kao pozitivan broj). 
 * Na kraju se štampa odgovarajuća poruka u formatu: "Broj je pozitivan/paran", "Broj je negativan/neparan", u zavisnosti od rezultata provjere.*/

public class ZadatakDvadesetCetiri {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int broj = sc.nextInt();
		int opisBroja = (broj > 0 ? 2 : 0) + (broj % 2 == 0 ? 1 : 0);
		
		switch (opisBroja) {
		
		case 0:
			System.out.print("Broj je negativan i neparan.");
			break;
		case 1:
			System.out.print("Broj je negativan i paran.");
			break;
		case 2:
			System.out.print("Broj je pozitivan i neparan.");
			break;
		case 3:
			System.out.print("Broj je pozitivan i paran.");
			break;
		case 4:
		}
		
		sc.close();
		
	}

}
