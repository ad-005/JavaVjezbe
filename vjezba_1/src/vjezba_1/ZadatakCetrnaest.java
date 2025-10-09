package vjezba_1;
import java.util.Scanner;

/*Ako je cijena taksija za jedan kilometar 0.5e, 
 * a početna cijena je 1e, napisati program koji za unijeti broj pređenih kilometara računa cijenu vožnje.*/

public class ZadatakCetrnaest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double pDist = sc.nextDouble();
		double cijenaVoznje = (pDist * 0.5) + 1;
		
		System.out.printf("Cijena voznje za %.2f kilometara iznosi %.2fe.", pDist, cijenaVoznje);
		
		sc.close();
		
	}

}
