package pravougaonik_zadatak;

public class GeometryApp {

	public static void main(String[] args) {
		Pravougaonik p1 = new Pravougaonik();
		Pravougaonik p2 = new Pravougaonik(10, 15, 40, 20);
		Tacka t1 = new Tacka();
		
		System.out.printf("%nPreklapanje p1 sa tačkom (t1): %B", p1.sadrzi(t1.getX(), t1.getY()));
		System.out.printf("%nPreklapanje p1 sa p2: %B", p1.sadrzi(p2.getX(), p2.getY()));
	}

}
