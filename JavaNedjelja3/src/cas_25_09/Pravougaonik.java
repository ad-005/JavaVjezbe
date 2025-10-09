package cas_25_09;
import java.util.Scanner;

public class Pravougaonik {
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double P = a*b;
		double O = 2*a+2*b;
		
		System.out.printf("Obim: %.2f\nPovrsina: %.2f", O, P);
		
		sc.close();
	}

}
