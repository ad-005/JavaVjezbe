package zad_1;

class TV extends EProizvodi {
	private int velicinaEkrana;
	
	@Override
	public String toString() {
		return "TV [" + super.toString() + "velicinaEkrana=" + velicinaEkrana + "]";
	}

	// Obracun cijene
	@Override
	public double odrediCijenu() {
		double cijena = super.odrediCijenu();
		
		if (velicinaEkrana > 65) {
			cijena *= 1.10;
		}
		
		return cijena;
	}
	
	// Konstruktori
	public TV(String opisProizvoda, String sifreProizvoda, double uvoznaCijena, int velicinaEkrana) {
		super(opisProizvoda, sifreProizvoda, uvoznaCijena);
		this.velicinaEkrana = velicinaEkrana;
	}
	
	// START GETTERS & SETTERS
	public int getVelicinaEkrana() {
		return velicinaEkrana;
	}

	public void setVelicinaEkrana(int velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}
	// END GETTERS & SETTERS
}
