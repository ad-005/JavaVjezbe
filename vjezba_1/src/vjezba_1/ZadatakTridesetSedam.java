package vjezba_1;
import java.util.Scanner;
import java.util.Random;

/*Vaš zadatak je da napravite program kojim provjeravate koje pčele se kreću po žici (štampati koordinate tih pčela). 
 * Žica se može predstaviti pravom y = 2 * x^2 - 5, dok se pčela predstavlja tačkom (x, y).*/

public class ZadatakTridesetSedam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj pcela: ");
		int brojPcela = sc.nextInt();
		
		provjeraPcela(brojPcela);

	}

	private static void provjeraPcela(int brojPcela) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		for (int i = 0; i < brojPcela; i++) {
			
//			int xP = rand.nextInt(26);
//			int yP = rand.nextInt(26);
			
			System.out.printf("X: ");
			int xP = sc.nextInt();
			System.out.printf("Y: ");
			int yP = sc.nextInt();
			
			if (yP == 2 * Math.pow(xP, 2) - 5) 
				System.out.printf("%nPcela %d (%d, %d) je na pravoj.%n", i + 1, xP, yP);

			else
				System.out.printf("%nPcela %d (%d, %d) nije na pravoj.%n", i + 1, xP, yP);
			
		}
		
	}
	
}
