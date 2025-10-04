package vjezba_1;
import java.util.Scanner;

/* Sportista se na početku treninga zagrijeva tako što trči po ivicama pravougaonog terena dužine d i širine s. 
 * Napisati program kojim se određuje koliko metara pretrči sportista dok obiđe teren 4 puta.*/

public class ZadatakCetiri {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite duzinu terena: ");
		double d = sc.nextDouble();
		System.out.print("Unesite sirinu terena: ");
		double s = sc.nextDouble();
		
		double metaraPretrcano = 4*(2*d + 2*s);
		
		System.out.printf("Sportista je u 4 kruga oko terena presao %.2fm.", metaraPretrcano);
		
		sc.close();
	}

}
