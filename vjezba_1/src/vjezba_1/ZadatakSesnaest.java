package vjezba_1;
import java.util.Random;

/*Cijena konzole za igre PlayStation 5 je prvo porasla 10%, pa je smanjena 10%. 
 * Ako je poznata početna cijena konzole, napisati program koji određuje cijenu nakon tih promjena.*/

public class ZadatakSesnaest {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		double cijenaKonzole = rand.nextDouble(100, 351);
		double cijenaIzmjena1 = (cijenaKonzole * 1.1);
		double cijenaIzmjena2 = cijenaIzmjena1 * 0.9;
		
		System.out.printf("Prvobitna cijena: %.2f\nCijena nakon promjena: %.2f", cijenaKonzole, cijenaIzmjena2);
		
	}

}
