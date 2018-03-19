import java.util.ArrayList;

import processing.core.PApplet;

public abstract class WeergaveObject {

	protected float x, y, vx, vy, ax, ay;
	protected float breedte, hoogte;
	protected boolean isZichtbaar;

	WeergaveObject(float x, float y, float breedte, float hoogte) {
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = hoogte;
	}

	protected ArrayList<IReageerder> reageerdersLijst = new ArrayList<IReageerder>();

	public void doeStap() {
		x++;
		if(x > 500) {
			x = 0;
		}
	}

	public abstract void geefWeer(PApplet app, float startX, float startY);

	public void geefMousePressedGebeurtenis(int mouseX, int mouseY) {

		System.out.println("MouseX: " + mouseX);
		System.out.println("MouseY: " + mouseY);

	}

	protected abstract boolean isMuisBinnen(int muisX, int muisY);

	protected void behandelMousePressedGebeurtenis() {

		for (IReageerder r : reageerdersLijst) {
			r.doeActie();
		}

	}

	public void voegReageerderToe(IReageerder reageerder) {

		reageerdersLijst.add(reageerder);
	}

	public void verwijderReageerder(IReageerder reageerder) {

		reageerdersLijst.remove(reageerder);
	}

}