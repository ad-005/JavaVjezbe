package zad_2;
import java.util.ArrayList;

class ObracunPlate {
	private String datumMjesecGodina;
	private Zaposleni zaposleni;
	private String napomene;
	private double iznos;
	private static ArrayList<ObracunPlate> istorija = new ArrayList<>();
	
	// ToString za bolji prikaz istorije (ako je velika npr.)
	@Override
	public String toString() {
		return "ObracunPlate [datumMjesecGodina=" + datumMjesecGodina + ", zaposleni=" + zaposleni + ", napomene="
				+ napomene + "]";
	}
	
	// Prikazivanje proslih obracuna
	public static void prikaziIstoriju() {
		for (ObracunPlate obracun : istorija) {
			System.out.println(obracun);
		}
	}

	// Konstruktori
	public ObracunPlate(String datumMjesecGodina, Zaposleni zaposleni,  String napomene, double iznos) {
		super();
		this.datumMjesecGodina = datumMjesecGodina;
		this.zaposleni = zaposleni;
		this.napomene = napomene;
		this.setIznos(iznos);
		istorija.add(this);
	}
	
	// START GETTERS & SETTERS
	public String getDatumMjesecGodina() {
		return datumMjesecGodina;
	}
	public void setDatumMjesecGodina(String datumMjesecGodina) {
		this.datumMjesecGodina = datumMjesecGodina;
	}
	public Zaposleni getZaposleni() {
		return zaposleni;
	}
	public void setZaposleni(Zaposleni zaposleni) {
		this.zaposleni = zaposleni;
	}
	public String getNapomene() {
		return napomene;
	}
	public void setNapomene(String napomene) {
		this.napomene = napomene;
	}
	
	public static ArrayList<ObracunPlate> getIstorija() {
		return istorija;
	}

	public static void setIstorija(ArrayList<ObracunPlate> istorija) {
		ObracunPlate.istorija = istorija;
	}
	public double getIznos() {
		return iznos;
	}

	public void setIznos(double iznos) {
		this.iznos = iznos;
	}
	// END GETTERS & SETTERS
	
}
