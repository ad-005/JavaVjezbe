package cas_25_09;
import java.util.Scanner;

public class IvicaStolnjaka {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double P = sc.nextDouble();
		double r = Math.sqrt(P / Math.PI);
		
		double O = 2*r*Math.PI;
		
		System.out.printf("Potrebna duzina trake: %.2f", O);
		
		sc.close();
	}

}
