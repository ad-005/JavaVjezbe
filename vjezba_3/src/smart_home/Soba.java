package smart_home;

class Soba {
	
	private int trenTemp, ciljTemp;
	
	// START METHODS
	
	public void ispisi() {
		System.out.printf("%nTrenutna temperatura sobe: %d | Ciljna temperatura sobe: %d", 
				getTrenTemp(), getCiljTemp());
	}
	
	// END METHODS
	
	// START KONSTRUKTORI

	public Soba() {
		
		trenTemp = 20;
		ciljTemp = 24;
		
	}
	
	public Soba(int trenTemp, int ciljTemp) {
		
		setTrenTemp(trenTemp);
		setCiljTemp(ciljTemp);
		
	}
	
	// END KONSTRUKTORI
	
	// START GETTERS & SETTERS
	
	public int getTrenTemp() {
		return trenTemp;
	}

	public void setTrenTemp(int trenTemp) {
		this.trenTemp = trenTemp;
	}

	public int getCiljTemp() {
		return ciljTemp;
	}

	public void setCiljTemp(int ciljTemp) {
		this.ciljTemp = ciljTemp;
	}
	
	// END GETTERS & SETTERS

}
