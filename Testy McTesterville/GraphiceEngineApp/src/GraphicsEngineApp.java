import java.util.ArrayList;

import processing.core.PApplet;

public class GraphicsEngineApp extends PApplet {

	public static void main(String[] args) {
		PApplet.main("GraphicsEngineApp");
	}

	protected ArrayList<WeergaveObject> weergavelijst = new ArrayList<WeergaveObject>();
	public WeergaveObjectContainer woc = new WeergaveObjectContainer(50, 50);


	public void settings() {
		size(500, 500);
	}

	public void setup() {
		
		weergavelijst.add(woc);
		Rechthoek r1 = new Rechthoek(150, 150, 50, 100, 10);
		Rechthoek r2 = new Rechthoek(10, 10, 100, 20, 100);
		Rechthoek r3 = new Rechthoek(50, 300, 36, 36, 200);

		woc.voegToe(r1);
		woc.voegToe(r2);
		woc.voegToe(r3);

	}

	public void draw() {
		background(255, 255, 0);
		for (WeergaveObject wo : weergavelijst) {
			woc.geefWeer(this, 0, 0);
			
		}
		
		woc.doeStap();
	}

	public void mousePressed() {
		for (WeergaveObject wo : weergavelijst) {
			if (wo.isMuisBinnen(mouseX, mouseY)) {
				woc.verwijder(wo);
			}
		}
	}
}