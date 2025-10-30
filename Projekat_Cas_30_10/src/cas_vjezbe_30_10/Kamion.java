package cas_vjezbe_30_10;

class Kamion extends Vozilo{
	private int kapacitetTereta;
	private boolean prikolica;
	
	// Racunanje cijene
	// Racunanje cijene
	@Override
	public double odrediCijenu() {
		double cijena = super.odrediCijenu();
		
		if (prikolica) {
			cijena += 50;
		}
		
		return cijena;
	}
	
	// Prikaz informacija
	
	@Override
	public String toString() {
		return "Kamion [" + super.toString() +"kapacitetTereta=" + kapacitetTereta + ", prikolica=" + prikolica + "]";
	}
	
	// Konstruktor
	public Kamion(String proizvodjac, String boja, int godinaProizvodnje, int kubikaza, int kapacitetTereta,
			boolean prikolica) {
		super(proizvodjac, boja, godinaProizvodnje, kubikaza);
		setKapacitetTereta(kapacitetTereta);
		setPrikolica(prikolica);
	}

	// START GETTERS & SETTERS
	public int getKapacitetTereta() {
		return kapacitetTereta;
	}
	public void setKapacitetTereta(int kapacitetTereta) {
		this.kapacitetTereta = kapacitetTereta;
	}
	public boolean isPrikolica() {
		return prikolica;
	}
	public void setPrikolica(boolean prikolica) {
		this.prikolica = prikolica;
	}
	// END GETTERS & SETTERS
	
	
}
