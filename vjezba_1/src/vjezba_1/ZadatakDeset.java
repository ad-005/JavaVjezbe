package vjezba_1;
import java.util.Scanner;
import java.util.Random;

/*Date su koordinate donje desne i gornje lijeve ivice zida (pravougaonik). 
 * Napisati program koji računa povrsinu i obim zida.*/

public class ZadatakDeset {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		double x1 = rand.nextDouble(20 - 2) + 1, y1 = rand.nextDouble(20) + 3, x2 = rand.nextDouble(20) + 1, y2 = rand.nextDouble(20 - 2) + 1;
		
		System.out.printf("x1: %.2f, y1: %.2f\nx2: %.2f, y2: %.2f", x1, y1, x2, y2);
		
		double a = Math.abs(x2 - x1), b = Math.abs(y1 - y2);
		double povrsina = a *b, obim = 2 * (a + b);
		
		System.out.printf("\nPovrsina: %.2f\nObim: %.2f", povrsina, obim);
		
		sc.close();
	}

}
