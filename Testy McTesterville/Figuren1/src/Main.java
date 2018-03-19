import processing.core.PApplet;

public class Main extends PApplet {

	private Figuur c;
	private Figuur r;

	public static void main(String[] args) {
		PApplet.main("Main");
	}

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		c = new Cirkel(200, 200, 50);
		r = new Rechthoek(10, 10, 50, 100);
	}

	public void draw() {
		background(0);
		c.teken(this);
		r.teken(this);
	}
}
