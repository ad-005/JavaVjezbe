
class Enemy {
	
	private int x, y, width, height, damage;
	
	
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
		this.damage = damage;
	}

	public Enemy(int x, int y, int width, int height) {
		
		this.x = 20;
		this.y = 30;
		this.width = 10;
		this.height = 15;
		this.damage = 1;
		
	}
	
	public static void main(String[] args) {
		
	}

}
