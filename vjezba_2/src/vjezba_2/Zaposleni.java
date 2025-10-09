package vjezba_2;
import java.util.ArrayList;

public class Zaposleni {
	
	private String ime, prezime;
	private int godineStaza;
	private double plata;
	
	// Metode
	public void ispisi() {
		
		System.out.printf("%nIme: %s | Prezime: %s | Godine staža: %d | Plata: %.2f",
				this.ime, this.prezime, this.godineStaza, this.plata);
		
	}
	
	public static void nadjiMaxPlatu(ArrayList<Zaposleni> zaposleni) {
		
		double maxPlata = 0;
		String punoImeZaposlenog = "";
		
		for (Zaposleni z : zaposleni) {
			if (z.getPlata() > maxPlata) {
				maxPlata = z.getPlata();
			 	punoImeZaposlenog = z.getIme() + " " + z.getPrezime();
			}
		}
		
		System.out.printf("%n%s ima najveću platu: %.2f", punoImeZaposlenog, maxPlata);
		
	}
	
	public void bonus() {
		
		if (this.plata < 800 && this.godineStaza > 10) {
			System.out.printf("%nZaposleni %s %s dobija bonus od %.2f.", this.ime, this.prezime, this.plata * 0.06);
			this.plata += this.plata * 0.06;
			System.out.printf(" Nova plata: %.2f.", this.plata);
		}
		
	}
	
	public Zaposleni(String ime, String prezime, int godineStaza, double plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.godineStaza = godineStaza;
		this.plata = plata;
	}
	
	public Zaposleni() {
		ime = "Marko";
		prezime = "Markovic";
		godineStaza = 5;
		plata = 5500;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Zaposleni> zaposleni = new ArrayList<>();
		
		Zaposleni z1 = new Zaposleni();
		Zaposleni z2 = new Zaposleni("Janko", "Jankovic", 4, 20000);
		Zaposleni z3 = new Zaposleni("Branko", "Brankovic", 3, 15000);
		Zaposleni z4 = new Zaposleni("Ne", "Znam1", 11, 700);
		Zaposleni z5 = new Zaposleni("Ne", "Znam2", 1, 5500);
		
		zaposleni.add(z1);
		zaposleni.add(z2);
		zaposleni.add(z3);
		zaposleni.add(z4);
		zaposleni.add(z5);
		
		z1.ispisi();
		z2.ispisi();
		z3.ispisi();
		z4.ispisi();
		z5.ispisi();
		
		nadjiMaxPlatu(zaposleni);
		z4.bonus();
		
	}

	// START GETTERS & SETTERS
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getgodineStaza() {
		return godineStaza;
	}

	public void setgodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}
	
	// END GETTERS & SETTERS
	
}
