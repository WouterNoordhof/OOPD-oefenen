import java.util.ArrayList;

import processing.core.PApplet;

@SuppressWarnings("serial")
public class KnoppenApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "KnoppenApp" });
	}

	private ArrayList<RadioKnop> knoppen = new ArrayList<>();

	public void settings() {
		size(400, 400);
	}

	public void setup() {
		background(0);
		int X = 75;
		int Y = 100;
		RadioKnop radio = new RadioKnop(this, X, Y, 50, 50);
		knoppen.add(radio);
		RadioKnop radio2 = new RadioKnop(this, X + X, Y, 50, 50);
		knoppen.add(radio2);
		RadioKnop radio3 = new RadioKnop(this, X + X + X, Y, 50, 50);
		knoppen.add(radio3);
		
		radio.voegDoelwitToe(radio2);
		radio.voegDoelwitToe(radio3);
		
		radio2.voegDoelwitToe(radio);
		radio2.voegDoelwitToe(radio3);
		
		radio3.voegDoelwitToe(radio2);
		radio3.voegDoelwitToe(radio);
		
	}

	public void draw() {
		for (Knop rb : knoppen) {
			rb.tekenKnop();
		}
	}

	public void mousePressed() {
		for (Knop rb : knoppen) {
			if (rb.isMuisOverKnop()) {
				rb.handelInteractieAf();
			}
		}
	}
}
