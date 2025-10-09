import java.util.ArrayList;
import java.util.Scanner;

public class SamZad3 {

	public static void genArray(Scanner sc, ArrayList<Integer> arr) {
		
		int arraySize = 5;
		
		
		for (int i = 0; i < arraySize; i++) {
			System.out.printf("%nUnesite broj posjeta %d. dana: ", i + 1);
			arr.add(sc.nextInt());
			
		}
	}
		
	
	public static int getMax(ArrayList<Integer> arr) {
		
		int max = 0;
		
		for (int i = 0; i < arr.size(); i++) {
		
			if (arr.get(i) > max) {
				max = arr.get(i);
			}
			
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<>();
		
		genArray(sc, x);
		System.out.printf("Najvise posjeta u jednom danu: %d", getMax(x));
		
		sc.close();
	}

}
