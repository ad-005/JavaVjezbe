package bankovni_sistem;

class Transakcija {
	
	private double iznos;
	private String tip, opis;
	
	// START METODE
	
	public boolean jeUplata() {
		
		return "uplata".equals(this.tip);
		
	}
	
	// END METODE
	
	// START KONSTRUKTORI
	
	public Transakcija(double iznos, String tip, String opis) {
		setIznos(iznos);
		setTip(tip);
		setOpis(opis);
	}
	
	public Transakcija() {
		setIznos(1);
		setTip("uplata");
		setOpis("Test uplata.");
	}
	
	// END KONSTRUKTORI
	
	// START GETTERS & SETTERS
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) {
		if (iznos <= 0) {
			System.out.printf("%nIznos za transakciju mora biti veći od 0.");
			this.iznos = 0;
		}
		else
			this.iznos = iznos;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		if (tip == null) {
			System.out.printf("%nMorate unijeti tip transakcije.");
			return;
		}
		
		if ("isplata".equals(tip) || "uplata".equals(tip))
			this.tip = tip;
		else
			System.out.printf("%nTip transakcije mora biti \"uplata\" ili \"isplata\".");
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	// END GETTERS & SETTERS
	
	
}
