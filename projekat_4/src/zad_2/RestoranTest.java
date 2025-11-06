package zad_2;
import java.util.ArrayList;

public class RestoranTest {
	public static void main(String[] args) {
		
		ArrayList<Zaposleni> zaposleni = new ArrayList<>();
		
		Restoran restoran = new Restoran("Restoran Kod Marka", "Sarajevo, ul. Marsala Tita 1", "123456789", zaposleni);
		
		restoran.dodajZaposlenog("Marko", "Markovic", "kuvar", 8.5, 1);
		restoran.dodajZaposlenog("Ana", "Anic", "konobar", 6.0, 2);
		restoran.dodajZaposlenog("Petar", "Petrovic", "menadzera", 12.0, 3);
		restoran.dodajZaposlenog("Jelena", "Jelenic", "konobar", 6.0, 4);
		restoran.dodajZaposlenog("Milan", "Milanovic", "kuvar", 8.0, 5);
		
		ArrayList<Zaposleni> smjena1Lista = new ArrayList<>();
		smjena1Lista.add(zaposleni.get(0));
		smjena1Lista.add(zaposleni.get(1));
		
		ArrayList<Zaposleni> smjena2Lista = new ArrayList<>();
		smjena2Lista.add(zaposleni.get(2));
		smjena2Lista.add(zaposleni.get(3));
		smjena2Lista.add(zaposleni.get(4));
		
		Smjena smjena1 = new Smjena("2025-11-01 08:00:00", "2025-11-01 16:00:00", "jutarnja", smjena1Lista);
		Smjena smjena2 = new Smjena("2025-11-01 16:00:00", "2025-11-02 00:00:00", "nocna", smjena2Lista);
		
		smjena1.dodijeliSate();
		smjena2.dodijeliSate();
		
		zaposleni.get(0).setPrekovremeniRad(50.0);
		zaposleni.get(1).setBonus(30.0);
		zaposleni.get(2).setBonus(100.0);
		
		restoran.obracunajMjesecnePlate("2025-11");
		
		System.out.println("--- Tabelarni prikaz ---");
		restoran.prikaziTabelarniPregled();
		
		System.out.println("---- Trosak plata ----");
		System.out.println("Ukupan trosak: " + restoran.trosakPlata() + " EUR");
	}
}
