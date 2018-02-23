import processing.core.PApplet;

public class IntroProcessing extends PApplet {
	public static void main(String[] args) {
		PApplet.main(new String[] { "IntroProcessing" });
	}

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		background(123, 12, 80);
		fill(0, 139, 139);
		rect(50, 50, 50, 50);
	}
}
