package vektor_zadatak;

public class Simulator {

	public static void main(String[] args) {
		Projektil p1 = new Projektil();

		p1.odbijAkoVanOkvira(40, 90, 40, 90);
		
		p1.update(2);
		p1.odbijAkoVanOkvira(40, 90, 40, 90);
		
		p1.update(1.7);
		p1.odbijAkoVanOkvira(40, 90, 40, 90);
		
		p1.update(1.5);
		p1.odbijAkoVanOkvira(40, 90, 40, 90);
		
	}

}
