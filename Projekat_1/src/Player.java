/*Clanovi grupe:
 * 1. Matija Sisevic
 * 2. Bogdan Jovovic
 * 3. Antonije Dragicevic*/


class Player {

	private int x, y, width, height, health;
	
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
		if (health >= 0 && health <= 100)
			this.health = health;
		else
			throw new IllegalArgumentException("Player mora imati izmedju 0 i 100 health point-a (ukljucujuci 0 i 100).");
	}

	public Player(int x, int y, int width, int height, int health) {
		
		this.x = 1;
		this.y = 1;
		this.width = 4;
		this.height = 10;
		this.health = 100;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
