package vjezba_1;
import java.util.Scanner;

/*Fudbalski teren dimenzija d×s treba ograditi pravougaonom ogradom 
 * tako da je rastojanje stranica ograde od linije terena r. 
 * Napisati program koji određuje dužinu ograde.*/

public class ZadatakDevet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Redosljed unosa: d - dužina terena u metrima\ns - širina terena u metrima\nr - rastojanje ograde od terena u metrima");
		double d = sc.nextDouble(), s = sc.nextDouble(), r = sc.nextDouble();
		
		d += 2*r;
		s += 2*r;
		
		double duzinaOgrade = 2 * (d + s);
		
		System.out.printf("Potrebna duzina ograde: %.2f jedinica.", duzinaOgrade);
		
		sc.close();
	}

}
