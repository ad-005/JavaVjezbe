package vjezba_1;
import java.util.Scanner;

/*Napisati program koji za unijete vrijednosti a, b, djelilac vraća sumu i broj elemenata 
 * djeljivih sa djelilac iz segmenta (a, b) (a i b ne pripadaju intervalu).*/

public class ZadatakTridesetSest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), djelilac = sc.nextInt();
		
		if (b <= a) {
			System.err.print("Raspon premali. Ne pokusavajte ponovo.");
			System.exit(0);
		}
		
		provjeraSegmenta(a, b, djelilac);
		
	}
	
	private static void provjeraSegmenta(int a, int b, int djelilac) {
		
		int sumaDjeljivih = 0;
		int brojDjeljivih = 0;
		
		for (int i = a + 1; i < b; i++) {
			
			if (i % djelilac == 0) {
				sumaDjeljivih += i;
				brojDjeljivih += 1;
			}
			
		}
		
		System.out.printf("Broj elemenata djeljivih sa %d u rasponu od %d do %d: %d\nSuma elemenata djeljivih sa %d u rasponu od %d do %d: %d", djelilac, a, b, brojDjeljivih, 
				djelilac, a, b, sumaDjeljivih);
		
	}

}
