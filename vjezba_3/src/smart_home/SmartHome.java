package smart_home;

public class SmartHome {

	public static void main(String[] args) {
			
		Soba soba1 = new Soba(17, 22);
		Termostat t1 = new Termostat("GRIJANJE");
		
		t1.ispisi();
		soba1.ispisi();
		
		System.out.println("");
		
		soba1.setTrenTemp(t1.korakPromjene(soba1.getTrenTemp(), soba1.getCiljTemp()));
		soba1.ispisi();
		
		soba1.setTrenTemp(t1.korakPromjene(soba1.getTrenTemp(), soba1.getCiljTemp()));
		soba1.ispisi();
		
		soba1.setTrenTemp(t1.korakPromjene(soba1.getTrenTemp(), soba1.getCiljTemp()));
		soba1.ispisi();
		
	}

}
