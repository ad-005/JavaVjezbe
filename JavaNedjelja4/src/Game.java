
public class Game {
	
	// Provjera za boolean ovdje
	public static void decreaseHealth(Player p, Enemy e) {
		if (checkCollision(p, e)) {
			p.setHealth(p.getHealth() - e.getDamage());
			System.out.printf("Sudar! Preostalo HP: %d%n", p.getHealth());
		}
		
		else
			System.out.printf("Nije doslo do sudara.%n");
	}
	
	// Moja greska: Metoda mora da vraca boolean
	public static boolean checkCollision(Player p, Enemy e) {
		
		double xP = p.getX(), yP = p.getY(), pWidth = p.getWidth(), pHeight = p.getHeight(); // Player varijable pozicije
		double xE = e.getX(), yE = e.getY(), eWidth = e.getWidth(), eHeight = e.getHeight(); // Enemy varijable pozicije
		
		// if podrazumijeva da su koordinate donja lijeva tacka pravougaonika (ispisuje se iz te tacke)
		return (xP < xE + eWidth && xP + pWidth > xE && yP < yE + eHeight && yP + pHeight > yE);
	}
	
	public static void main(String[] args) {
		
		Player player1 = new Player(10, 10, 20, 20, 100);
		Enemy enemy1 = new Enemy(15, 15, 20, 20, 30);
		Enemy enemy2= new Enemy(100, 100, 20, 20, 40);
		
		decreaseHealth(player1, enemy1);
		decreaseHealth(player1, enemy2); // Onda se ovaj metod poziva u main, da bi konzistentno skidalo HP objektu player1, kojem treba da skida
		decreaseHealth(player1, enemy1);

	} // Kod kuce probati bez static parametara

}
