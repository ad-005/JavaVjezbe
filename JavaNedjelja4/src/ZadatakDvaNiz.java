import java.util.ArrayList;

public class ZadatakDvaNiz {

	public static void createArray(ArrayList<Integer> arr) {
		
		for (int i = 0; i < 10; i++) {
			arr.add(i + 1);
		}
		
	}
	
	public static void outArray(ArrayList<Integer> arr) {
		
		System.out.print("Niz normal: ");
		for (int i = 0; i <= arr.size(); i++) {
			System.out.printf("%d ", arr.get(i));
		}
		
	}
	
	public static void flipArray(ArrayList<Integer> arr) {
		
		System.out.printf("%nNiz flipped: ");
		for (int i = arr.size() - 1; i >= 0; i--) {
			System.out.printf("%d ", i - 1, arr.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		createArray(arr);
		outArray(arr);
		flipArray(arr);
		

	}

}
