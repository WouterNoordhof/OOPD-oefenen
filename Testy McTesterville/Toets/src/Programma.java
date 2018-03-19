import processing.core.PApplet;

public class Programma extends PApplet {
	public static void main(String[] args) {
		PApplet.main(("Programma") );
	}
	
	Klok deKlok;
	
	public void settings() {
		size(400, 300);
	}
	public void setup() {
		background(255);
		deKlok = new Klok(150, 100, 200);
		deKlok.setTijd(23, 59);
		deKlok.tekenKlok();
	}
}