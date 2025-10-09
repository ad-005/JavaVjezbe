package vjezba_1;
import java.util.Scanner;
import java.time.LocalDate;

/*Napisati program koji računa koje godine je rođen Miloš 
 *ukoliko je poznato da danas ima N godina.*/

public class ZadatakDvanaest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int godTrenutna = LocalDate.now().getYear();
		
		int godMilos = godTrenutna - N;
		
		System.out.printf("Milos je rodjen %d godine.", godMilos);
		
		sc.close();
		
	}

}
