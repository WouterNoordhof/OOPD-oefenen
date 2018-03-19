
public class Zoogdier extends Dier {
	protected int aantalZuigelingen;
	
	public Zoogdier(int x, int y, int a) {
		super(x, y);
		this.aantalZuigelingen = a;
	}

	public void plantVoort() {
		this.aantalZuigelingen += 1;
	}
	
	public String toString() {
		return "Ik ben zo reproductief, ik heb "+ aantalZuigelingen + " zuigelingen";
	}
}
