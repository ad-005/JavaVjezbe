package cas_25_09;
import java.util.Scanner;
import java.util.Random;

public class ZadatakPetnaest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int x1 = sc.nextInt(), y1 = sc.nextInt();
		int p1, p2; // x i y koordinate paketa, tim redosljedom
		
		int N = sc.nextInt(); // broj paketa
		int distancaUk = 0;
		
		for (int i = 0; i <= N; i++) {
			
			p1 = rand.nextInt(N) + 1;
			p2 = rand.nextInt(N) + 1;
			
			distancaUk += Math.hypot(p1 - x1, p2 - y1);
			
		}
		
		System.out.printf("Ukupna distanca koju dron mora preci je %d jedinica.", distancaUk);
		
		sc.close();
	}

}
