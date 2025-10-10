package pravougaonik_zadatak;

class Pravougaonik {

	private int x, y, width, height;
	
	// START METHODS
	
	public void ispisi() {
		System.out.printf("%nPravougaonik Info | X: %d, Y: %d, širina: %d, dužina: %d", this.x, this.y, this.width, this.height);
	}
	
	public boolean sadrzi(int tx, int ty) {
		return this.x <= tx && tx < this.x + this.width && this.y <= ty && ty < this.y + this.height;
	}
	
	// END METHODS
	
	// START KONSTRUKTORI
	
	public Pravougaonik(int x, int y, int width, int height) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	
	public Pravougaonik() {
		setX(1);
		setY(1);
		setWidth(10);
		setHeight(3);
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width <= 0)
			System.err.printf("%nŠirina mora biti veća od 0.");
		else
			this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height <= 0)
			System.err.printf("%nVisina mora biti veća od 0.");
		else
			this.height = height;
	}
	
	// END GETTERS & SETTERS
	
}
