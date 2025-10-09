
class Enemy {

	private double x, y, width, height;
	private int damage;
	
	// Konstruktor
	public Enemy() {
		x = 10;
		y = 10;
		width = 5;
		height = 5;
		damage = 10;
	}
	
	// Getteri i setteri za width, height i poziciju [START]
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

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	// Getteri i setteri za width, height i poziciju [END]

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (damage >= 1)
			this.damage = damage;
		else
			System.err.print("Damage mora biti veci ili jednak 1.");
	}
	

	// Konstruktor args
	public Enemy(double x, double y, double width, double height, int damage) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
	}
	
}
