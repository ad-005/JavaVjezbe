package vjezba_1;
import java.util.Scanner;

/*Na takmičenju iz matematike učestvovalo je N učenika. 
 * Izveštaj o broju poena odštampan je na dvije strane. 
 * Nastavnik greškom nije ponio prvu stranu izveštaja, ali se sjeća da je na dnu strane pisalo da je prosječan broj poena za tu stranu bio p1. 
 * Na drugoj strani (koju ima kod sebe) su podaci o K učenika i prosječan broj poena za tu stranu je p2. 
 * Napisati program kojim se određuje koliki je prosječan broj poena svih učenika.*/

public class ZadatakDvadeset {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		double p1 = sc.nextDouble();
		double p2 = sc.nextDouble();
		
		double prosjekUk = ((p1 * (N - K)) + (p2 * K)) / N;
		
		System.out.printf("Prosjecan broj bodova: %.2f", prosjekUk);
		
		sc.close();
		
	}

}
