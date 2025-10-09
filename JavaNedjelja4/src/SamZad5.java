import java.util.ArrayList;
import java.util.Random;

public class SamZad5 {

	public static void genArray(Random rand, ArrayList<Integer> arr) {
		
		System.out.printf("%nUnesite duzinu niza: ");
		int arraySize = rand.nextInt(1, 51);
		
		
		for (int i = 0; i < arraySize; i++) {
			System.out.printf("%nUnesite %d. elemenat niza: ", i + 1);
			arr.add(rand.nextInt(1, 51));
			
		}
	}
	
	public static void flipValues(ArrayList<Integer> arr) {
		
		int el;
		
		for (int i = 0; i < arr.size(); i++) {
			
			if (arr.get(i) < 0) {
				el = arr.get(i);
				arr.set(Math.abs(arr.get(i)), i);
			}
			
			else {
				el = arr.get(i);
				arr.set(-el, i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> x = new ArrayList<>();
		
		genArray(rand, x);
		flipValues(x);
		
		System.out.printf("Zamijenjeni niz: ");
		for (int i = 0; i < x.size(); i++) {
			
			System.out.printf("%d ", x.get(i));
			
		}

	}

}
