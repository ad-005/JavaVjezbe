package vjezba_3;

public class Color {
	private int red, green, blue;
	
	public static void main(String[] args) {
		
		Color boja1 = new Color();
		
		boja1.printColor();
		
		boja1.addRed(-20);
		boja1.addBlue(15);
		
		boja1.printColor();
		
	}
	
	// Start metode
	public void printColor() {
		
		System.out.printf("%nred: %d, green: %d , blue: %d", this.red, this.green, this.blue);
		
	}
	
	public int oneCheck(int colorValue, int change, String colorName) {
		
		int newValue = colorValue + change;
		
		if (newValue < 0) {
			System.out.printf("%nVrijednost %s ne može biti manja od 0. Vrijednost postavljena na 0.", colorName);
			return 0;
		}
		
		else if (newValue > 255) {
			System.out.printf("%nVrijednost %s ne može biti veća od 255. Vrijednost postavljena na 255.", colorName);
			return 255;
		}
		
		else {
			System.out.printf("%nVrijednost %s promijenjena na: %d", colorName, newValue);
			return newValue;
		}
		
	}
	
	public void addRed(int change) {
		this.red = oneCheck(this.red, change, "red");
	}
	
	public void addGreen(int change) {
		this.green = oneCheck(this.green, change, "green");
	}

	public void addBlue(int change) {
		this.blue = oneCheck(this.blue, change, "blue");
	}
	
	// End metode
	
	// Start Getters & Setters
	
	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		if (0 <= red && red <= 255)
			this.red = red;
		else
			System.err.printf("%nVrijednost mora biti izmedju 0 i 255 (uključivo).");
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		if (0 <= green && green <= 255)
			this.green = green;
		else
			System.err.printf("%nVrijednost mora biti izmedju 0 i 255 (uključivo).");
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		if (0 <= blue && blue <= 255)
			this.blue = blue;
		else
			System.err.printf("%nVrijednost mora biti izmedju 0 i 255 (uključivo).");
	}

	// End Getters & Setters
	
	// Start Konstruktori
	public Color(int red, int green, int blue) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}
	
	public Color() {
		red = 255;
		green = 255;
		blue = 255;
	}
	// End Konstruktori

}
