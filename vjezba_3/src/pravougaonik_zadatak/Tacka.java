package pravougaonik_zadatak;

class Tacka {
	
	private int x, y;

	// START METODE
	
	public void ispisi() {
		System.out.printf("%nTačka Info | X: %d, Y: %d", x, y);
	}
	
	// END METODE
	
	// START KONSTRUKTORI
	
	public Tacka(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public Tacka() {
		setX(2);
		setY(2);
	}
	
	// END KONSTRUKTORI
	
	// START GETTERS & SETTERS
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	// END GETTERS & SETTERS
	

}
