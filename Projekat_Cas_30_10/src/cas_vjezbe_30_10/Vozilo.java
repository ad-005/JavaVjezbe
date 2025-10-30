package cas_vjezbe_30_10;

class Vozilo {

	private String proizvodjac, boja;
	private int godinaProizvodnje, kubikaza;
	private double osnovnaCijena = 100;
	
	// Racunanje cijene
	public double odrediCijenu() {
		double cijena = osnovnaCijena;
		
		if (godinaProizvodnje < 2010) {
			cijena += 30;
		}
		
		if (kubikaza > 2000) {
			cijena += 50;
		}
		
		return cijena;
	}
	
	// Prikaz informacija
	@Override
	public String toString() {
		return "Vozilo [proizvodjac=" + proizvodjac + ", boja=" + boja + ", godinaProizvodnje=" + godinaProizvodnje
				+ ", kubikaza=" + kubikaza + "]";
	}
	
	// Konstruktor
	public Vozilo(String proizvodjac, String boja, int godinaProizvodnje, int kubikaza) {
		super();
		setProizvodjac(proizvodjac);
		setBoja(boja);
		setGodinaProizvodnje(godinaProizvodnje);
		setKubikaza(kubikaza);
	} 

	// GETTERS & SETTERS
	public double getOsnovnaCijena() {
		return osnovnaCijena;
	}
	
	public void setOsnovnaCijena(double osnovnaCijena) {
		this.osnovnaCijena = osnovnaCijena;
	}
	
	public String getProizvodjac() {
		return proizvodjac;
	}
	
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	// END GETTERS AND SETTERS
	
	
	
}
