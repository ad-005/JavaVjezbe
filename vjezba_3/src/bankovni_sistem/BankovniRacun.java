package bankovni_sistem;

class BankovniRacun {

	private String imeVlasnika;
	private double stanje;
	
	// START METHODS
	
	public void ispisi() {
		System.out.printf("%nIme vlasnika: %s | Stanje na racunu: %.2f", imeVlasnika, stanje);
	}
	
	public void uplati(double iznos) {
		if (iznos <= 0)
			System.out.printf("%nIznos uplate mora biti veći od 0.");
		else {
			this.stanje += iznos;
			System.out.printf("%nUspjesno ste uplatili %.2f na racun.", iznos);
		}
	}
	
	public void isplati(double iznos) {
		if (this.stanje - iznos < 0)
			System.out.printf("%nNedovoljno sredstava. Trenutno stanje: %.2f", this.stanje);
		
		else if (iznos <= 0){
			System.out.printf("%nIznos isplate mora biti veći od 0.");
		}
		
		else {
			this.stanje -= iznos;
			System.out.printf("%nUspjesno ste isplatili %.2f sa racuna.", iznos);
		}
	}
	
	// END METHODS
	
	// START GETTERS & SETTERS
	
	public String getImeVlasnika() {
		return imeVlasnika;
	}



	public void setImeVlasnika(String imeVlasnika) {
		if (imeVlasnika == null || imeVlasnika.trim().isEmpty())
			System.out.printf("Ime vlasnika računa mora biti minimum 1 karakter.");
		else
			this.imeVlasnika = imeVlasnika;
	}



	public double getStanje() {
		return stanje;
	}



	public void setStanje(double stanje) {
		if (stanje < 0)
			System.out.printf("Početno stanje mora biti veće od 0.");
		else
			this.stanje = stanje;
		
	}

	// END GETTERS & SETTERS
	
	// START KONSTRUKTORI
	
	public BankovniRacun() {
		setImeVlasnika("Marko Markovic");
		setStanje(670000.54);
	}
	
	public BankovniRacun(String imeVlasnika, double stanje) {
		setImeVlasnika(imeVlasnika);
		setStanje(stanje);
	}
	
	// END KONSTRUKTORI

}
