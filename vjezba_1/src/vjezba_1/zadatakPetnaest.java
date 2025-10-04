package vjezba_1;
import java.util.Random;
import java.util.Scanner;

/*Knjižara "Bukvarnica" je posebno mjesto gdje svaka knjiga ima svoju priču. 
 * Kako bi proslavili dolazak novog godišnjeg doba, knjižara je odlučila da uvede popust,
 * svaka knjiga dobija popust koji se može otkriti samo uz pomoć programa. 
 * Kao pomoćnik u knjižari, vaš zadatak je da napišete program koji će izračunati konačnu cijenu knjige nakon primijenjenog popusta.*/

public class zadatakPetnaest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		double cijenaKnjige = sc.nextDouble();
		double popust = rand.nextDouble(5, 51);
		double novaCijena = cijenaKnjige - cijenaKnjige * (popust/100);
		
		System.out.printf("Cijena knjige sa popustom od %.2f%% iznosi %.2fe.", popust, novaCijena);
		
		sc.close();
		
	}

}
