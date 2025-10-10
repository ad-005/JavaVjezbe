package vjezba_3;

public class Automobil {
	private String marka, model;
	private int godiste, brzina;

	public static void main(String[] args) {
		
		Automobil benga = new Automobil();
		benga.ispisi();
		benga.uspori(15);
		benga.ispisi();
		benga.ubrzaj(5);
		benga.ispisi();
		benga.uspori(250);
		benga.ispisi();
		
	}
	
	// START METODE
	
	public void ubrzaj(int vrijednost) {
	
		if (vrijednost <= 0) {
			System.out.printf("%nUbrzanje mora biti veće od 0.");
			return;
		}
		
		if (this.brzina + vrijednost > 200) {
			this.brzina = 200;
			System.out.printf("%nBrzina ne smije preći 200, sada je postavljena na maksimum.");
		}
		else {
			this.brzina += vrijednost;
			System.out.printf("%nBrzina povecana na %d.", this.brzina);
		}
		
	}
	
	public void uspori(int vrijednost) {
		
		if (vrijednost <= 0) {
			System.out.printf("%nMorate usporiti za vise od 0.");
			return;
		}
		
		if (this.brzina - vrijednost < 0) {
			this.brzina = 0;
			System.out.printf("%nBrzina ne smije biti manja od 0, brzina je sada postavljena na minimum.");
		}
		else {
			this.brzina -= vrijednost;
			System.out.printf("%nBrzina smanjena na %d.", this.brzina);
		}
		
	}
	
	public void ispisi() {
		System.out.printf("%nMarka: %s | Model: %s | Godiste: %d | Brzina: %d", this.marka, this.model, this.godiste, this.brzina);
	}
	
	// END METODE
	
	// START GETTERS & SETTERS
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		if (0 <= brzina && brzina <= 200)
			this.brzina = brzina;
		else
			System.err.printf("%nBrzina mora biti izmedju 0 i 200 (uključujući)");
	}

	// END GETTERS & SETTERS
	
	// START KONSTRUKTORI
	
	public Automobil(String marka, String model, int godiste, int brzina) {
		setMarka(marka);
		setModel(model);
		setGodiste(godiste);
		setBrzina(brzina);
	}
	
	public Automobil() {
		marka = "BMW";
		model = "X7 M60i";
		godiste = 2026;
		brzina = 190;
	}
	
	// END KONSTRUKTORI

}
