package cas_vjezbe_30_10;

class Automobil extends Vozilo {

	private int brojVrata;
	private String tipMotora;
	private boolean dizel;
	
	// Racunanje cijene
	@Override
	public double odrediCijenu() {
		double cijena = super.odrediCijenu();
		
		if (dizel) {
			cijena += 20;
		}
		
		return cijena;
	}
	
	// Prikaz informacija

	@Override
	public String toString() {
		return "Automobil [" +  super.toString() +"brojVrata=" + brojVrata + ", tipMotora=" + tipMotora + ", dizel=" + dizel + "]";
	}
	
	// Konstruktor
	public Automobil(String proizvodjac, String boja, int godinaProizvodnje, int kubikaza, int brojVrata,
			String tipMotora) {
		super(proizvodjac, boja, godinaProizvodnje, kubikaza);
		setBrojVrata(brojVrata);
		setTipMotora(tipMotora);
	}

	// START GETTERDS & SETTERS
	public int getBrojVrata() {
		return brojVrata;
	}
	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	public String getTipMotora() {
		return tipMotora;
	}
	public void setTipMotora(String tipMotora) {
		this.tipMotora = tipMotora;
	}
	// END GETTERS & SETTERS
	
	
}
