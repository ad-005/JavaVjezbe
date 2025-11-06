package zad_1;
import java.util.ArrayList;

public class EProizvodi {
	private String opisProizvoda, sifreProizvoda;
	private double uvoznaCijena;
	private double maloprodajnaCijena;
	
	@Override
	public String toString() {
		return "EProizvodi [opisProizvoda=" + opisProizvoda + ", sifreProizvoda=" + sifreProizvoda + ", uvoznaCijena="
				+ uvoznaCijena + ", maloprodajnaCijena=" + maloprodajnaCijena + "]";
	}

	// Stampanje odredjenog tipa proizvoda
	public static void stampajTip(ArrayList<EProizvodi> uredjaji, String tip) {
		for (EProizvodi proizvod: uredjaji) {
			if (tip.equals("Racunari") && proizvod instanceof Racunari) {
				System.out.println(proizvod);
			} else if (tip.equals("Telefoni") && proizvod instanceof Telefoni) {
				System.out.println(proizvod);
			} else if (tip.equals("TV") && proizvod instanceof TV) {
				System.out.println(proizvod);
			} else {
				System.err.println("Ovaj tip proizvoda ne postoji.");
			}
		}
	}
	
	// Odredjivanje cijene
	public double odrediCijenu() {
		double cijena = this.uvoznaCijena;
		
		return cijena * 1.05;
	}
	
	// Konstruktori
	public EProizvodi(String opisProizvoda, String sifreProizvoda, double uvoznaCijena) {
		super();
		this.opisProizvoda = opisProizvoda;
		this.sifreProizvoda = sifreProizvoda;
		this.uvoznaCijena = uvoznaCijena;
		setMaloprodajnaCijena(uvoznaCijena);
	}
	// START GETTERS & SETTERS
	public String getOpisProizvoda() {
		return opisProizvoda;
	}
	public void setOpisProizvoda(String opisProizvoda) {
		this.opisProizvoda = opisProizvoda;
	}
	public String getSifreProizvoda() {
		return sifreProizvoda;
	}
	public void setSifreProizvoda(String sifreProizvoda) {
		this.sifreProizvoda = sifreProizvoda;
	}
	public double getUvoznaCijena() {
		return uvoznaCijena;
	}
	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	public double getMaloprodajnaCijena() {
		return maloprodajnaCijena;
	}
	public void setMaloprodajnaCijena(double maloprodajnaCijena) {
		this.maloprodajnaCijena = this.uvoznaCijena * 1.05;
	}
	
	// END GETTERS & SETTERS

}
