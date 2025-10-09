package cas_25_09;
import java.util.Scanner;

public class ZadatakDvaPapir {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double P = (a * b)/100;
		
		System.out.printf("Povrsina je %.2fcm2", P);
		
		sc.close();
	}

}
