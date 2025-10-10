package bankovni_sistem;

public class App {

	public static void main(String[] args) {
		BankovniRacun racun1 = new BankovniRacun();
		Transakcija transakcija1 = new Transakcija(5000, "isplata", "Test isplata.");
		Transakcija transakcija2 = new Transakcija(25000, "uplata", "Test uplata.");

		if (transakcija1.jeUplata())
			racun1.uplati(transakcija1.getIznos());
		else
			racun1.isplati(transakcija1.getIznos());
		
		racun1.ispisi();
		
		if (transakcija2.jeUplata())
			racun1.uplati(transakcija2.getIznos());
		else
			racun1.isplati(transakcija2.getIznos());
		
		racun1.ispisi();
	}

}
