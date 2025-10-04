package vjezba_1;
import java.util.Random;

/*Napisati program kojim se proverava da li se može napraviti bašta u obliku trougla sa datim dužinama stranica.*/

public class ZadatakDvadesetSest {

	public static void main(String[] args) {

		Random rand = new Random();
		
		double a = rand.nextDouble(50);
		double b = rand.nextDouble(50);
		double c = rand.nextDouble(50);
		
		System.out.printf("A: %.2f\nB: %.2f\nC: %.2f", a, b, c);
		
		int provjera = (a + b > c ? 1 : 0) + (a + c > b ? 1 : 0) + (b + c > a ? 1 : 0);
		
		if (provjera == 3) {
			System.out.print("\nMoguce je napraviti bastu u obliku trougla");
		}
		
		else {
			System.out.print("\nNije moguce napraviti bastu u obliku trougla.");
		}
	}

}
