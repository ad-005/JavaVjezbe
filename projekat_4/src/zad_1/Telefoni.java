package zad_1;

class Telefoni extends EProizvodi {
	private String operativniSistem;
	private int velicinaEkrana;
	
	@Override
	public String toString() {
		return "Telefoni [" + super.toString() + "operativniSistem=" + operativniSistem + ", velicinaEkrana=" + velicinaEkrana + "]";
	}

	// Obracun cijene
	@Override
	public double odrediCijenu() {
		double cijena = super.odrediCijenu();
		
		if (velicinaEkrana > 6) {
			cijena *= 1.03;
		}
		
		return cijena;
	}
	
	// Konstruktori
	public Telefoni(String opisProizvoda, String sifreProizvoda, double uvoznaCijena, String operativniSistem,
			int velicinaEkrana) {
		super(opisProizvoda, sifreProizvoda, uvoznaCijena);
		this.operativniSistem = operativniSistem;
		this.velicinaEkrana = velicinaEkrana;
	}
	
	// START GETTERS & SETTERS
	public String getOperativniSistem() {
		return operativniSistem;
	}
	public void setOperativniSistem(String operativniSistem) {
		this.operativniSistem = operativniSistem;
	}
	public int getVelicinaEkrana() {
		return velicinaEkrana;
	}
	public void setVelicinaEkrana(int velicinaEkrana) {
		this.velicinaEkrana = velicinaEkrana;
	}
	// END GETTERS & SETTERS
	
}
