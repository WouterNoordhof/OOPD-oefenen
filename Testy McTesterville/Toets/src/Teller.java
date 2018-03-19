import processing.core.PApplet;

public class Teller extends PApplet {
	private int max, waarde;
	float x, y, breedte, hoogte;

	public Teller(int max, float x, float y, float b, float h) {
		this.max = max;
		waarde = 0;
		this.x = x;
		this.y = y;
		this.breedte = b;
		this.hoogte = h;
	}

	public void tik() {
		waarde = (waarde + 1) % max;
	}

	public String getTijdNotatie() {
		if (waarde < 10) {
			return "0" + waarde;
		} else {
			return "" + waarde;
		}
	}

	public int getWaarde() {
		return waarde;
	}

	public void setWaarde(int waarde) {
		if (waarde >= 0 && waarde < max) {
			this.waarde = waarde;
		}
	}

	void tekenTeller() {
		rectMode(CENTER);
		noStroke();
		fill(0);
		rect(x, y, breedte, hoogte);

		
	}
}
