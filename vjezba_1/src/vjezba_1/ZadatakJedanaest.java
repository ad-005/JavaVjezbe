package vjezba_1;
import java.util.Scanner;
import java.util.Random;

/*Napisati program za euclide_distance((x1, x2), (y1, y2)) 
 * kojom se računa i vraća euklidsko rastojanje izmedju dvije tacke A i B. 
 * Tacka A par (x1, y1), dok je tačka B par (x2, y2).*/

public class ZadatakJedanaest {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		double x1 = rand.nextDouble(10), y1 = rand.nextDouble(10), x2 = rand.nextDouble(11, 26), y2 = rand.nextDouble(11, 26);
		
		double eukDist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.printf("Euklidsko rastojanje izmedju tacaka (%.2f, %.2f) i (%.2f, %.2f) iznosi %.2f", x1, y1, x2, y2, eukDist);
		
		sc.close();
	}

}
