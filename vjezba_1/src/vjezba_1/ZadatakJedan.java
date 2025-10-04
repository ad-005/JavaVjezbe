package vjezba_1;
import java.util.Scanner;

//Napisati program koji računa površinu i obim pravougaonika na osnovu zadatih dimenzija.
public class ZadatakJedan {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite stranice a i b (tim redosljedom):\n");
		double a = sc.nextDouble(), b = sc.nextDouble();
		
		double povrsina = a * b;
		double obim = 2*a+2*b;
		
		System.out.printf("Povrsina: %.2f\nObim:%.2f", povrsina, obim);
		
		sc.close();
		
	}
	
}
