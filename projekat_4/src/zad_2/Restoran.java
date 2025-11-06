package zad_2;
import java.util.ArrayList;

class Restoran {
	private String naziv, adresa, pib;
	private ArrayList<Zaposleni> zaposleni;
	
	public Restoran(String naziv, String adresa, String pib, ArrayList<Zaposleni> zaposleni) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
		this.zaposleni = zaposleni;
	}
	
	// Uklanjanje zaposlenog
	public void ukloniZaposlenog(int id) {
		boolean uklonjen = zaposleni.removeIf(z -> z.getId() == id);
		
		if (!uklonjen) {
			System.err.println("Zaposleni sa ID " + id + " nije pronadjen.");
		}
	}
	
	// Dodavanje zaposlenog
	public void dodajZaposlenog(String ime, String prezime, String tip, double satnica, int id) {
		zaposleni.add(new Zaposleni(ime, prezime, tip, satnica, id));
	}
	
	// Obracun mjesecnih troskova restorana
	public void obracunajMjesecnePlate(String mjesecGodina) {
		for (Zaposleni z : zaposleni) {
			double plata = z.getSatnica() * z.getBrojSati();
			
			if (z.getPrekovremeniRad() > 0) {
				plata += z.getPrekovremeniRad();
			}
			if (z.getBonus() > 0) {
				plata += z.getBonus();
			}
			
			z.setPlata(plata);
			new ObracunPlate(mjesecGodina, z, "Mjesecna plata", plata);
		}
	}
	
	// Tabelarni pregled
	public void prikaziTabelarniPregled() {
		System.out.println("ID\tIme\tPrezime\tTip\tSati\tPrekovremeni\tBonus\tPlata");
		for (Zaposleni z : zaposleni) {
			System.out.println(z.getId() + "\t" + z.getIme() + "\t" + z.getPrezime() + "\t" + 
					z.getTip() + "\t" + z.getBrojSati() + "\t" + z.getPrekovremeniRad() + "\t" + 
					z.getBonus() + "\t" + z.getPlata());
		}
	}
	
	public double trosakPlata() {
		double troskoviPlate = 0;
		
		for (Zaposleni z : zaposleni) {
			troskoviPlate += z.getPlata();
		}
		
		return troskoviPlate;
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public ArrayList<Zaposleni> getZaposleni() {
		return zaposleni;
	}

	public void setZaposleni(ArrayList<Zaposleni> zaposleni) {
		this.zaposleni = zaposleni;
	}
}