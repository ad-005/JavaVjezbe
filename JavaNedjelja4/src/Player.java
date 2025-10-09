
class Player {

	private double x, y, width, height;
	private int health;
	
	// Konstruktor
	public Player() {
		x = 1;
		y = 1;
		width = 2;
		height = 2;
		health = 100;
		
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

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (0 < health && health <= 100)
			this.health = health;
		else
			System.err.print("Health mora biti izmedju (ne ukljucuje) 0 i 100 (ukljucuje).");
	}

	// Konstruktor 2
	public Player(double x, double y, double width, double height, int health) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
	}
	
}
