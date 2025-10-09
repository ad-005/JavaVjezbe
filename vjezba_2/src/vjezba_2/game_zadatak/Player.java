package vjezba_2.game_zadatak;

class Player {
	
	private int x, y, width, height, health;

	// Konstruktor
	public Player(int x, int y, int width, int height, int health) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
		
	}
	
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
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (0 <= health && health <= 100)
			this.health = health;
		else
			System.err.print("%nHealth mora biti izmedju 0 i 100 (uključivo).");
	}
	// END GETTERS & SETTERS
	

}
