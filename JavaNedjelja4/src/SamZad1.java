import java.util.ArrayList;
import java.util.Scanner;

public class SamZad1 {

	public static void genArray(Scanner sc, ArrayList<Integer> arr) {
		
		System.out.printf("Unesite broj studenata: %n");
		int brojStudenata = sc.nextInt();
		
		for (int i = 0; i < brojStudenata; i++) {
			System.out.printf("Unesite broj bodova studenta br. %d: %n", i + 1);
			arr.add(sc.nextInt());
		}
		
	}
	
	public static void prosjek(ArrayList<Integer> arr) {
		
		double suma = 0;
		
		for (int i = arr.size() - 1; i >= 0; i--) {
			
			suma += arr.get(i);
			
		}
		
		System.out.printf("Prosjek bodova: %.2f", suma / arr.size());
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		genArray(sc, x);
		
		System.out.print("Bodovi na ispitu: ");
		
		for (int i = x.size() - 1; i >= 0; i--) {
			System.out.printf("%d ", x.get(i));
		}
		
		prosjek(x);
		
	}

}
