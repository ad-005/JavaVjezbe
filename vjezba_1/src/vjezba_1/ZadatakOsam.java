package vjezba_1;
import java.util.Scanner;

/*Napisati program kojim se izračunava
 *  potrebna dužina trake za ivicu stoljnjaka kružnog oblika čija je površina P.*/

public class ZadatakOsam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double povrsina = sc.nextDouble();
		double duzinaTrake = 2*(Math.sqrt(povrsina/Math.PI))*Math.PI;

		System.out.printf("Potrebna duzina trake za sto povrsine %.2f je %.2f.", povrsina, duzinaTrake);
		
		sc.close();
	}

}
