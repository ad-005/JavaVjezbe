package vjezba_2;

public class Televizor {
	
	private int brojKanala, jacinaTona;
	private String nazivKanala;
	
	
	// Metode
	public void pojacajTon() {
		
		if (this.jacinaTona < 10)
			this.jacinaTona++;
		else
			System.out.printf("%nTon je vec na maksimumu (10).");
		
	}
	
	public void ispisi() {
		
		System.out.printf("%nBroj kanala: %d | Naziv kanala: %s | Jacina tona: %d", 
				this.brojKanala, this.nazivKanala, this.jacinaTona);
		
	}
	
	// START GETTERS & SETTERS
	
	public int getBrojKanala() { return brojKanala; }

	public void setBrojKanala(int brojKanala) { 
		if (brojKanala >= 1)
			this.brojKanala = brojKanala;
		else
			System.err.print("%nBroj kanala mora biti veći od ili jednak 1.");
	} 

	public int getJacinaTona() { return jacinaTona; }

	public void setJacinaTona(int jacinaTona) { 
		if (0 <= jacinaTona && jacinaTona <= 10)
			this.jacinaTona = jacinaTona; 
		else
			System.err.print("%nJačina tona mora biti izmedju 0 i 10 (uključvo).");
	}

	public String getNazivKanala() { return nazivKanala; }

	public void setNazivKanala(String nazivKanala) { this.nazivKanala = nazivKanala; }
	
	// END GETTERS & SETTERS
	
	public Televizor() {
		
		brojKanala = 1;
		jacinaTona = 2;
		nazivKanala = "RTCG1";
		
	}


	public static void main(String[] args) {
		
		Televizor televizor = new Televizor();
		
		televizor.ispisi();
		televizor.pojacajTon();
		televizor.ispisi();

	}

}
