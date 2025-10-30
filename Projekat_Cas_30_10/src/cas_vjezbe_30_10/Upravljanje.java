package cas_vjezbe_30_10;

public class Upravljanje {

	public static void main(String[] args) {
		Automobil bembara = new Automobil("BMW", "crna", 2026, 4400, 4, "S63B44T4");
		Kamion kamion1 = new Kamion("Volvo", "Crvena", 2018, 12000, 18000, true);
		Kombi kombi1 = new Kombi("Mercedes", "Bijela", 2020, 2200, 9);
		
        System.out.println(bembara);
        System.out.printf("Cijena registracije: %.2f EUR%n%n", bembara.odrediCijenu());
        
        System.out.println(kamion1);
        System.out.printf("Cijena registracije: %.2f EUR%n%n", kamion1.odrediCijenu());
        
        System.out.println(kombi1);
        System.out.printf("Cijena registracije: %.2f EUR%n", kombi1.odrediCijenu());
		
	}

}
