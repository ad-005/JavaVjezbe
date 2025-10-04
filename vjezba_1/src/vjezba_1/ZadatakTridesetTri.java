package vjezba_1;
import java.util.Scanner;

/*Napisati program za igru fizz_buzz. 
 * Nakon unosa cijelog broj N treba provjeriti sledeća pravila: 
 * ako je broj djeljiv sa 5 ali ne i sa 3 poruka treba da bude “Fizz”; 
 * ako je broj djeljiv sa 3 ali ne i sa 5 poruka treba da bude “Buzz”; 
 * ako je broj djeljiv sa oba 3 i 5 poruka treba da bude “FizzBuzz”; 
 * ako broj nije djeljiv ni sa 3 ni sa 5, poruka treba da bude broj N.*/

public class ZadatakTridesetTri {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cijeliBroj = sc.nextInt();
		
		System.out.printf("Broj je: %d%n%n", cijeliBroj);
		
		fizzBuzz(cijeliBroj);

	}
	
	private static void fizzBuzz(int broj) {
		
		if (broj % 5 == 0 && broj % 3 != 0)
			System.out.print("Fizz");
		
		else if (broj % 5 != 0 && broj % 3 == 0)
			System.out.print("Buzz");
		
		else if (broj % 5 == 0 && broj % 3 == 0)
			System.out.print("FizzBuzz");
		
		else
			System.out.print(broj);
			
	}

}
