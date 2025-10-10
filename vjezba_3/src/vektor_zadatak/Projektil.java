package vektor_zadatak;

class Projektil {
	
	private double pozX, pozY, velX, velY;
	
	// START METODE
	
	public void ispisi() {
		System.out.printf("%nTrenutna pozicija projektila: (%.2f, %.2f)", getPozX(), getPozY());
	}
	
	public void odbijAkoVanOkvira(int xMin, int xMax, int yMin, int yMax) {
		boolean bounced = false;
		
		if (getPozX() < xMin || getPozX() > xMax) {
			bounced = true;
			setVelX(-getVelX());
			System.out.printf("%nProjektil izašao van okvira (X osa). Brzina invertovana.");
		}
		
		if (getPozY() < yMin || getPozY() > yMax) {
			bounced = true;
			setVelY(-getVelY());
			System.out.printf("%nProjektil izašao van okvira (Y osa). Brzina invertovana.");
		}
		
		if (bounced) {
			if (getPozX() < xMin) setPozX(xMin);
			if (getPozX() > xMax) setPozX(xMax);
			if (getPozY() < yMin) setPozY(yMin);
			if (getPozY() > yMax) setPozY(yMax);
		} else {
			System.out.printf("%nProjektil nije izašao iz okvira.");
		}
		
	}
	
	public void update(double dt) {
		setPozX(getPozX() + getVelX() * dt);
		setPozY(getPozY() + getVelY() * dt);
		
		System.out.printf("%nProjektil se pomjerio. Nova pozicija: (%.2f, %.2f)", getPozX(), getPozY());
	}
	
	// END METODE
	
	
	// START KONSTRUKTORI
	
	public Projektil(double pozX, double pozY, double velX, double velY) {
		setPozX(pozX);
		setPozY(pozY);
		setVelX(velX);
		setVelY(velY);
	}
	
	public Projektil() {
		setPozX(40);
		setPozY(40);
		setVelX(10);
		setVelY(10);
	}
	
	// END KONSTRUKTORI
	
	
	// START GETTERS & SETTERS
	
	public double getPozX() {
		return pozX;
	}

	public void setPozX(double pozX) {
		this.pozX = pozX;
	}

	public double getPozY() {
		return pozY;
	}

	public void setPozY(double pozY) {
		this.pozY = pozY;
	}

	public double getVelX() {
		return velX;
	}

	public void setVelX(double velX) {
		this.velX = velX;
	}

	public double getVelY() {
		return velY;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}
	
	// END GETTERS & SETTERS

}
