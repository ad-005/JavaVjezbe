package zad_2;

class Zaposleni {
	private String ime, prezime, tip;
	private int brojSati, id;
	private double prekovremeniRad, bonus, plata, satnica;
	
	// Dodavanje sati (na postojece)
	public void dodajSate(int sati) {
		this.brojSati += sati;
	}
	
	// Konstruktor
	public Zaposleni(String ime, String prezime, String tip, double satnica, int id) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.tip = tip;
		this.satnica = satnica;
		this.id = id;
		this.brojSati = 0;
		this.prekovremeniRad = 0;
		this.bonus = 0;
		this.plata = 0;
	}
	
	// START GETTERI SETTERI
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getTip() {
		return tip;
	}
	
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	public int getBrojSati() {
		return brojSati;
	}
	
	public void setBrojSati(int brojSati) {
		this.brojSati = brojSati;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getPlata() {
		return plata;
	}
	
	public void setPlata(double plata) {
		this.plata = plata;
	}
	
	public double getPrekovremeniRad() {
		return prekovremeniRad;
	}
	
	public void setPrekovremeniRad(double prekovremeniRad) {
		this.prekovremeniRad = prekovremeniRad;
	}
	
	public double getSatnica() {
		return satnica;
	}

	public void setSatnica(double satnica) {
		this.satnica = satnica;
	}
	
	// END GETTERI SETTERI
}