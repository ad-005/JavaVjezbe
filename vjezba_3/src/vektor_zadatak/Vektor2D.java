package vektor_zadatak;

class Vektor2D {

	private double x, y;
	
	// START METODE
	
	public void pomjeri(double dx, double dy) {
		
		setX(getX() + dx);
		setY(getY() + dy);
		
		System.out.printf("%nPomjereno na nove koordinate: (%.2f, %.2f)", getX(), getY());
		
	}
	
	public void postavi(double nx, double ny) {
		
		setX(nx);
		setY(ny);
		
		System.out.printf("%nTačka vektora postavljena na koordinate: (%.2f, %.2f)", getX(), getY());
		
	}
	
	// END METODE
	
	// START KONSTRUKTORI
	
	public Vektor2D() {
		
		setX(4);
		setY(4);
		
	}
	
	public Vektor2D(double x, double y) {
		
		setX(x);
		setY(y);
		
	}
	
	// END KONSTRUKTORI

	
	// START GETTERS & SETTERS
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	// END GETTERS & SETTERS
	
}
