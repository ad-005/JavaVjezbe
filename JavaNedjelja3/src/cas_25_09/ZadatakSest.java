package cas_25_09;
import java.util.Scanner;

public class ZadatakSest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble(), x2 = sc.nextDouble(), x3 = 0, y1 = sc.nextDouble(), y2 = sc.nextDouble(), y3 = 0;
		
		x3 = x2 + 2;
		y3 = y2 - 3;
		
		double hrastKuca = Math.hypot(x2 - x1, y2 - y1);
		double hrastBlago = Math.hypot(x3 - x1, y3 - y1);
		double hrastKucaBlago = hrastKuca + hrastBlago;
		
		System.out.printf("Hrast -> Kuca: %.2f\nHrast -> Blago: %.2f\nHrast -> Kuca -> Blago: %.2f", hrastKuca, hrastBlago, hrastKucaBlago);
		
		sc.close();
		
	}

}
