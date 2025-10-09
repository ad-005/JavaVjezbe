import java.util.ArrayList;
import java.util.Scanner;

public class SamZad2 {

	public static int nadjiParniPozitivniProsjek(ArrayList<Integer> arr) {
		
		int suma = 0, count = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			
			if (arr.get(i) > 0 && arr.get(i) % 2 == 0) {
				suma += arr.get(i);
				count++;
			}
			
		}
		
		return suma / count;
		
	}
	
	public static void genArray(Scanner sc, ArrayList<Integer> arr) {
		
		System.out.printf("Unesite broj elemenata niza: %n");
		int brElemenata = sc.nextInt();
		
		for (int i = 0; i < brElemenata; i++) {
			System.out.printf("Unesite element niza br. %d%n", i + 1);
			arr.add(sc.nextInt());
		}
		
	}
	
	public static void reverseArray(ArrayList<Integer> arr) {
		
		System.out.print("%nNiz unazad: ");
		for (int i = arr.size() - 1; i >= 0; i--) {
			
			System.out.printf("%d ", arr.get(i));
			
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		genArray(sc, x);
		
		System.out.printf("%nParni pozitivni prosjek zadatog niza je: %d", nadjiParniPozitivniProsjek(x));
		
		sc.close();
	}

}
