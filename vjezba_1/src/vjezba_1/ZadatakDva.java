package vjezba_1;
import java.util.Scanner;

/* Napisati program koji koristi tri varijable a, b i c, 
 * a računa vrijednosti x1 i x2 kvadratne jednacine ax^2 + bx + c = 0. 
 * Ignorisati slučaj negativnih vrijednosti ispod korijena (kompleksni brojevi). */
public class ZadatakDva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		double x1, x2;
		
		if ((Math.pow(b, 2) - (4 * a * c)) < 0) { 
			System.err.println("Broj ispod korijena negativan, probajte ponovo.");
			System.exit(1);
		}
		
		else {
			x1 = (-b+Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2*a);
			x2 = (-b-Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2*a);
			
			System.out.printf("X1:%.2f\nX2:%.2f", x1, x2);
		}
		
		sc.close();

	}

}
