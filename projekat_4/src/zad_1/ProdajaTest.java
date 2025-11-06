package zad_1;
import java.util.Scanner;
import java.util.ArrayList;

public class ProdajaTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<EProizvodi> uredjaji = new ArrayList<EProizvodi>();
		
		System.out.printf("1. Unos uredjaja%n2. Pregled svih uredjaja sa maloprodajnom cijenom%n3. Pregled odredjenog tipa uredjaja");
		
		int odabir = sc.nextInt();
		sc.nextLine();
		
		switch (odabir) {
			case 1:
				System.out.println("Unesite tip uredjaja za unos: ");
				String tipUredjaja = sc.nextLine().trim();
				
				System.out.println("Unesite opis proizvoda:");
				String opisProizvoda = sc.nextLine().trim();
				System.out.println("Unesite sifru uredjaja: ");
				String sifraUredjaja = sc.nextLine().trim();
				System.out.println("Unesite uvoznu cijenu uredjaja: ");
				double uvoznaCijena = sc.nextDouble();
				sc.nextLine();
				
				if (tipUredjaja.equals("Racunari")) {
					System.out.println("Unesite tip procesora: ");
					String tipProcesora = sc.nextLine();
					System.out.println("Unesite velicinu memorije: ");
					int memorija = sc.nextInt();
					sc.nextLine();
					
					uredjaji.add(new Racunari(opisProizvoda, sifraUredjaja, uvoznaCijena, tipProcesora, memorija));
				} else if (tipUredjaja.equals("Telefoni")) {
					System.out.println("Unesite operativni sistem: ");
					String operativniSistem = sc.nextLine().trim();
					System.out.println("Unesite velicinu ekrana: ");
					int velicinaEkrana = sc.nextInt();
					sc.nextLine();
					
					uredjaji.add(new Telefoni(opisProizvoda, sifraUredjaja, uvoznaCijena, operativniSistem, velicinaEkrana));
				} else if (tipUredjaja.equals("TV")) {
					System.out.println("Unesite velicinu ekrana: ");
					int velicinaEkrana = sc.nextInt();
					sc.nextLine();
					
					uredjaji.add(new TV(opisProizvoda, sifraUredjaja, uvoznaCijena, velicinaEkrana));
				} else {
					System.err.println("Taj tip uredjaja ne postoji.");
				}
				
				break;
				
			case 2:
				System.out.println("------- PREGLED SVIH UREDJAJA SA MALOPRODAJNOM CIJENOM ------");
				for (EProizvodi uredjaj : uredjaji) {
					System.out.println(uredjaj);
				}
				break;
				
			case 3:
				System.out.println("Unesite tip uredjaja za pregled: ");
				String tipUredjaja1 = sc.nextLine().trim();
				EProizvodi.stampajTip(uredjaji, tipUredjaja1);
				break;
				
			default:
				sc.close();
				throw new IllegalArgumentException("Ta opcija nije validna.");
		}
		
		sc.close();
	}

}
