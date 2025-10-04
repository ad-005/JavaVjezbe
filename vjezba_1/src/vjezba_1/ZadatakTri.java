package vjezba_1;
import java.util.Scanner;

// Razlika kvadrata za a i b
public class ZadatakTri {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(), b = sc.nextDouble();
		
		double rezultat = (Math.pow(a,  2) - Math.pow(b,  2));
		System.out.printf("Razlika kvadrata %.2f i %.2f je %.2f", a, b, rezultat);
		
		sc.close();
	}

}
