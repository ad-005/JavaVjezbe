import java.util.ArrayList;
import java.util.Scanner;

public class SamZad4 {

	 public static ArrayList<Integer> genArray(Scanner sc, ArrayList<Integer> arr) {
		 
		 System.out.print("Unesite duzinu niza: ");
		 int arrayLength = sc.nextInt();
		 
		 for (int i = 0; i < arrayLength; i ++) {
			 System.out.printf("%nUnesite %d. elemenat niza: ", i + 1);
			 arr.add(sc.nextInt());
		 }
		 
		 return arr;
		 
	 }
	 
	 public static void sortArray(ArrayList<Integer> arr) {
		 
		 int pos1;
		 
		 for (int i = 0; i < arr.size(); i++) {
			 for (int j = 0; j < arr.size(); j ++) {
			 
				 if (arr.get(i) > arr.get(j)) {
					 
					 pos1 = arr.get(i);
					 arr.set(i, arr.get(j));
					 arr.set(j, pos1);
					 
				 }
			 }
			 
		 }
		 
	 }
	 
	 public static boolean checkArray(Scanner sc, ArrayList<Integer> arr) {
		 
		 System.out.printf("%nUnesite  broj za provjeru: ");
		 int userNum = sc.nextInt();
		 
		 for (int i = 0; i < arr.size() - 1; i++) {
			 if (arr.get(i) == userNum)
				 return true;
			 
		 }
		 
		 return false;
	 }
	 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> x = new ArrayList<>();
		
		genArray(sc, x);
		sortArray(x);
		
		System.out.printf("%nSortirani niz: ");
		for (int i = x.size() - 1; i >= 0; i--) {
			
			System.out.printf("%d ", x.get(i));
			
		}
		
		sc.close();
	}

}
