package zad_2;
import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Smjena {
	private String datumStart, datumEnd, tipSmjene;
	private ArrayList<Zaposleni> naSmjeni;
	private ArrayList<Smjena> evidencija = new ArrayList<Smjena>();
	
	// To string
	@Override
	public String toString() {
		return "Smjena [datumStart=" + datumStart + ", datumEnd=" + datumEnd + ", tipSmjene=" + tipSmjene
				+ ", naSmjeni=" + naSmjeni + ", evidencija=" + evidencija + "]";
	}
	
	// Dodijeliti sate
	public void dodijeliSate() {
		int sati = odrediSate();
		
		for (Zaposleni z : naSmjeni) {
			z.dodajSate(sati);
		}
	}

	// Racunanje sati zaposlenih
	private int odrediSate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        LocalDateTime pocetak = LocalDateTime.parse(datumStart, formatter);
        LocalDateTime kraj = LocalDateTime.parse(datumEnd, formatter);
        
        Duration trajanjeSmjene = Duration.between(pocetak, kraj);
        
        return (int) trajanjeSmjene.toHours();
	}
	
	// Konstruktori
	public Smjena(String datumStart, String datumEnd, String tipSmjene, ArrayList<Zaposleni> naSmjeni) {
		super();
		this.datumStart = datumStart;
		this.datumEnd = datumEnd;
		this.tipSmjene = tipSmjene;
		this.naSmjeni = naSmjeni;
		evidencija.add(this);
	}
	
	// START GETTERS & SETTERS
	public String getDatumStart() {
		return datumStart;
	}
	public void setDatumStart(String datumStart) {
		this.datumStart = datumStart;
	}
	public String getDatumEnd() {
		return datumEnd;
	}
	public void setDatumEnd(String datumEnd) {
		this.datumEnd = datumEnd;
	}
	public String getTipSmjene() {
		return tipSmjene;
	}
	public void setTipSmjene(String tipSmjene) {
		this.tipSmjene = tipSmjene;
	}

	public ArrayList<Zaposleni> getNaSmjeni() {
		return naSmjeni;
	}

	public void setNaSmjeni(ArrayList<Zaposleni> naSmjeni) {
		this.naSmjeni = naSmjeni;
	}
	public ArrayList<Smjena> getEvidencija() {
		return evidencija;
	}

	public void setEvidencija(ArrayList<Smjena> evidencija) {
		this.evidencija = evidencija;
	}
	// END GETTERS & SETTERS
	

}
