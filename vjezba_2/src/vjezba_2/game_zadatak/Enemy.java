package vjezba_2.game_zadatak;

class Enemy {

	private int x, y, width, height, damage;

	// Konstruktor
	public Enemy(int x, int y, int width, int height, int damage) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
		
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

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (0 <= damage && damage <= 100)
			this.damage = damage;
		else
			System.err.print("%nDamage mora biti izmedju 0 i 100 (uključivo).");
	}
	// END GETTERS & SETTERS
	
}
