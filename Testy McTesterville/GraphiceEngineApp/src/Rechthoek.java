import processing.core.PApplet;

public class Rechthoek extends Figuur {

	Rechthoek(float x, float y, float breedte, float hoogte, int vulKleur) {

		super(x, y, breedte, hoogte, vulKleur);
	}

	@Override
	public void geefWeer(PApplet app, float startX, float startY) {

		app.fill(getVulKleur());
		app.rect(startX + x, startY + y, breedte, hoogte);

	}

	@Override
	public boolean isMuisBinnen(int muisX, int muisY) {
		// TODO Auto-generated method stub
		if (muisX >= x && muisX < x + breedte && muisY >= y && muisY < y + hoogte) {
			return true;
		} else {
			return false;
		}
	}

}