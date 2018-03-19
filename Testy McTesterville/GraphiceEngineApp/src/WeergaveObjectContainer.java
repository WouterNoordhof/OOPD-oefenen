import processing.core.PApplet;
import java.util.ArrayList;

public class WeergaveObjectContainer extends WeergaveObject {

	protected ArrayList<WeergaveObject> weergavelijst = new ArrayList<WeergaveObject>();

	public WeergaveObjectContainer(float x, float y) {
		super(x, y, 0, 0);
	}

	@Override
	public void geefWeer(PApplet app, float startX, float startY) {
		for (WeergaveObject wObject : weergavelijst) {
			wObject.geefWeer(app, startX, startY);
		}

	}

	@Override
	protected boolean isMuisBinnen(int muisX, int muisY) {
		for (WeergaveObject wo : weergavelijst) {
			if (wo.isMuisBinnen(muisX - (int) x, muisY - (int) y)) {
				return true;
			}
		}
		return false;
	}

	public void voegToe(WeergaveObject object) {
		weergavelijst.add(object);
	}

	public void verwijder(WeergaveObject object) {
		weergavelijst.remove(object);
	}

	public void doeStap() {
		for (WeergaveObject wo : weergavelijst) {

			wo.doeStap();
		}
	}
}
