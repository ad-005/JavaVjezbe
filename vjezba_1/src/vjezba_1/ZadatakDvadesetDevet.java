package vjezba_1;
import java.util.Random;

/*Kupili ste zavjesu pravouganog oblika. 
 * Provjerite da li će zavjesa prekriti prozor koji je takođe pravouganog oblika. 
 * Za zavjesu i prozor poznata je gornja lijeva i donja desna koordinata.*/

public class ZadatakDvadesetDevet {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		double x1 = rand.nextDouble(16), y1 = rand.nextDouble(20, 36), x2 = rand.nextDouble(20, 36), y2 = rand.nextDouble(16),
				xp1 = rand.nextDouble(16), yp1 = rand.nextDouble(20, 36), xp2 = rand.nextDouble(20, 36), yp2 = rand.nextDouble(16);
		
		System.out.printf("X1: %.2f\nY1: %.2f\nX2: %.2f\nY2: %.2f\n\nXp1: %.2f\nYp1: %.2f\nXp2: %.2f\nYp2: %.2f", x1, y1, x2, y2, xp1, yp1, xp2, yp2);
		
		if (x1 <= xp1 && y1 >= yp1 && x2 >= xp2 && y2 <= yp2) {
			System.out.print("\n\nZavjesa ce pokriti prozor.");
		}
		
		else {
			System.out.print("\n\nZavjesa nece pokriti prozor.");
		}
		
	}

}
