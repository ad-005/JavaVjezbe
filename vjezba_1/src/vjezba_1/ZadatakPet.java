package vjezba_1;
import java.util.Scanner;

/*Napisati program koji na osnovu zadate širine i visine lista papira (pravougaonog oblika)
 *  u milimetrima određuje njegovu površinu u kvadratnim centimetrima.*/

public class ZadatakPet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite dimenzije papira u milimetrima (Enter izmedju unosa):");
		
		double a = sc.nextDouble(), b = sc.nextDouble();
		double povrsinaCm2 = (a * b)/100;
		
		System.out.printf("Povrsina papira u cm2 iznosi %.2f", povrsinaCm2);
		
		sc.close();
		
	}

}
