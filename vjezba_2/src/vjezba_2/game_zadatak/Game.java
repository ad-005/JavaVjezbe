package vjezba_2.game_zadatak;

public class Game {
	
	public static void decreaseHealth(Player p, Enemy e) {
		
		if (p.getHealth() < e.getDamage())
			p.setHealth(0);
		
		else
			p.setHealth(p.getHealth() - e.getDamage());
		
		if (p.getHealth() == 0) 
			System.out.print("Igrac poginuo.");
		else
			System.out.printf("Igrac povrijedjen za %dHP. Preostalo HP: %d", e.getDamage(), p.getHealth());
	}
	
	public static boolean checkCollision(Player p, Enemy e) {
		
		int xP = p.getX(), yP = p.getY(), xE = e.getX(), yE = e.getY(),
				pWidth = p.getWidth(), pHeight = p.getHeight(), eWidth = e.getWidth(), eHeight = e.getHeight();
		
		return (xP < xE + eWidth && xP + pWidth > xE && yP < yE + eHeight && yP + pHeight > yE);
		
	}
	
	public static void main(String[] args) {
		
		Player player1 = new Player(0, 0, 50, 50, 100);
		Enemy enemy1 = new Enemy(25, 25, 50, 50, 20);
		
		if (checkCollision(player1, enemy1))
			decreaseHealth(player1, enemy1);
		else
			System.out.printf("%nIgrac i neprijatelj se nisu dotakli.");
		
	}

}
