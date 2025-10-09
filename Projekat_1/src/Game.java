
public class Game {

	public static void checkCollision(Player p, Enemy e) {
		
		int pWidth = p.getWidth(), pHeight = p.getHeight(), pX = p.getX(), pY = p.getY();
		int eWidth = e.getWidth(), eHeight = e.getHeight(), eX = e.getX(), eY = e.getY();
		
		
		if (pX < eX + eWidth && pX + pWidth > eX && pY < eY + eHeight && pY + pHeight > eY) {
			
			int pHealth = p.getHealth();
			int eDmg = e.getDamage();
			
			p.setHealth(pHealth - eDmg);
			
			System.out.printf("%nSudar. Preostalo HP: %d", pHealth - eDmg);
		}
		
		else {
			System.out.printf("Nije doslo do sudara.");
		}
		
	}
	
	public void decreaseHealth(Player p, Enemy e) {
		
		int hpIgraca = p.getHealth();
		int dmgEnemy = e.getDamage();
		
		if (p.getHealth() > 0) {
			p.setHealth(hpIgraca - dmgEnemy);
			System.out.printf("%nTrenutni HP igraca: %d", hpIgraca);
		}
		
	}
	
	public static void main(String[] args) {
		
		Player p1 = new Player(20, 30, 50, 60, 100);
		Enemy e1 = new Enemy(40, 50, 70, 80);
		
		checkCollision(p1, e1);

	}

}
