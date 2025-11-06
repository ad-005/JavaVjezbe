package zad_1;

class Racunari extends EProizvodi {
	private String procesor;
	private int memorija;
	
	// ToString
	@Override
	public String toString() {
		return "Racunari [" + super.toString() + "procesor=" + procesor + ", memorija=" + memorija + "]";
	}

	// Obracun cijene
	@Override
	public double odrediCijenu() {
		double cijena = super.odrediCijenu();
		
		return cijena * 1.05;
	}
	
	// Konstruktori
	public Racunari(String opisProizvoda, String sifreProizvoda, double uvoznaCijena, String procesor, int memorija) {
		super(opisProizvoda, sifreProizvoda, uvoznaCijena);
		this.procesor = procesor;
		this.memorija = memorija;
	}
	
	// START GETTERS & SETTERS
	public String getProcesor() {
		return procesor;
	}

	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public int getMemorija() {
		return memorija;
	}
	public void setMemorija(int memorija) {
		this.memorija = memorija;
	}
	// END GETTERS & SETTERS
	
}
