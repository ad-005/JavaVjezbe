package studentska_sluzba;
import java.util.ArrayList;

class Student {

	private String ime, prezime;
	private int brojIndeksa;
	private ArrayList<Integer> ocjene;
	
	// START METODE
	
	public void addGrade(int ocjena) {
		
		if (6 <= ocjena && ocjena <= 10) {
			ocjene.add(ocjena);
			System.out.printf("%nDodata ocjena %d za %s %s %d.", ocjena, ime, prezime, brojIndeksa);
		}
		
		else
			System.err.print("%nOcjena mora biti izmedju 6 i 10 (uključujući)");
		
	}
	
	public double gradeAverage() {
		
		if (ocjene.isEmpty())
			return 0.0;
		
		int suma = 0;
		for (int ocjena : this.ocjene) {
			suma += ocjena;
		}
		
		return (double) suma / ocjene.size();
	}
	
	public boolean loanStatus() {
		return gradeAverage() > 9;
	}
	
	// END METODE
	
	// START KONSTRUKTORI
	
	public Student(String ime, String prezime, int brojIndeksa) {
		this.ime = ime;
		this.prezime = prezime;
		this.brojIndeksa = brojIndeksa;
		ocjene = new ArrayList<>();
	}
	
	public Student() {
		ime = "Marko";
		prezime = "Markovic";
		brojIndeksa = 1;
		ocjene = new ArrayList<>();
	}
	
	// END KONSTRUKTORI
	
	
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



	public int getBrojIndeksa() {
		return brojIndeksa;
	}



	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	
    public ArrayList<Integer> getOcjene() {
        return ocjene;
    }

	// END GETTERS & SETTERS
	
}
