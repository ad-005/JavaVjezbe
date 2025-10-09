package cas_25_09;
import java.util.Scanner;

public class PovObimZida {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble(), x2 = sc.nextDouble(), y1 = sc.nextDouble(), y2 = sc.nextDouble();
		
		double a = Math.abs(x1 - x2);
		double b = Math.abs(y2 - y1);
		
		double p = a * b;
		double o = 2*a+2*b;
		
		System.out.printf("Povrsina: %.2f\nObim: %.2f", p, o);
		
		sc.close();
	}

}
