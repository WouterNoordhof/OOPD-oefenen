
public class Klok {
	private Teller mTeller;
	private Teller uTeller;
	private float x, y, hoogte, breedte;

	public Klok(float x, float y, float breedte) {
		this.x = x;
		this.y = y;
		this.breedte = breedte;
		this.hoogte = breedte * 0.4f;
		uTeller = new Teller(24, x, y, breedte / 2, hoogte);
		mTeller = new Teller(60, x + breedte / 2, y, breedte / 2, hoogte);
	}
	
	public void tik() {
		mTeller.tik();
		if(mTeller.getWaarde() == 0) {
			uTeller.tik();
		}
	}
	
	public void setTijd(int uur, int minuten) {
		uTeller.setWaarde(uur);
		mTeller.setWaarde(minuten);
	}
	
	public void tekenKlok() {
		mTeller.tekenTeller();
		uTeller.tekenTeller();
	}
}
