package cas_vjezbe_30_10;

class Kombi extends Vozilo {

	private int kapacitetPutnika;
	
	// Racunanje cijene
	@Override
	public double odrediCijenu() {
		double cijena = super.odrediCijenu();
		
		if (kapacitetPutnika > 8) {
			cijena += 30;
		}
		
		return cijena;
	}

	// Prikaz informacija
	@Override
	public String toString() {
		return "Kombi [" + super.toString() +"kapacitetPutnika=" + kapacitetPutnika + "]";
	}
	
	// Konstruktori
	public Kombi(String proizvodjac, String boja, int godinaProizvodnje, int kubikaza, int kapacitetPutnika) {
		super(proizvodjac, boja, godinaProizvodnje, kubikaza);
		setKapacitetPutnika(kapacitetPutnika);
	}

	// START GETTERI & SETTERI
	public int getKapacitetPutnika() {
		return kapacitetPutnika;
	}
	public void setKapacitetPutnika(int kapacitetPutnika) {
		this.kapacitetPutnika = kapacitetPutnika;
	}
	
	// END GETTERI & SETTERI
	
}
