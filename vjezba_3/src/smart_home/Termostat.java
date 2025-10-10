package smart_home;

class Termostat {

	private int minTemp, maxTemp;
	private String mod;
	
	// START METHODS
	
	public int korakPromjene(int tren, int cilj) {
		
		if ("GRIJANJE".equals(getMod()) && tren < cilj) {
			return ++tren;
		}
		
		if ("HLADJENJE".equals(getMod()) && tren > cilj) {
			return --tren;
		}
		
		return tren;
		
	}
	
	public void ispisi() {
		System.out.printf("%nMin. temperatutra: %d | Max. temperatura: %d | Mod: %s", 
				getMinTemp(), getMaxTemp(), getMod());
	}
	
	// END METHODS
	
	// START KONSTRUKTORI

	public Termostat () {
		
		setMinTemp(16);
		setMaxTemp(28);
		setMod("HLADJENJE");
		
	}

	public Termostat (String mod) {
		
		setMinTemp(16);
		setMaxTemp(28);
		setMod(mod);
		
	}
	
	// END KONSTRUKTORI
	
	
	// START GETTERS & SETTERS
	
	public int getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}

	public int getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		if (mod == null || mod.trim().isEmpty()) {
			System.err.printf("%nMorate unijeti validan mod rada: \"HLADJENJE\" ili \"GRIJANJE\".");
			return;
		}
		
		if ("GRIJANJE".equals(mod) || "HLADJENJE".equals(mod))
			this.mod = mod;
		else
			System.err.printf("%nMorate unijeti validan mod rada: \"HLADJENJE\" ili \"GRIJANJE\".");
	}
	
	// END GETTERS & SETTERS
	
}
