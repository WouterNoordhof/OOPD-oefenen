
public class Vis extends Dier {
	protected int aantalEieren;
	
	public Vis(int x, int y, int aantalEieren) {
		super(x, y);
		this.aantalEieren = aantalEieren;
	}

	@Override
	public void plantVoort() {
		this.aantalEieren += 1;
		
	}
	
	public String toString() {
		return "Ik ben zo reproductief, ik heb "+ aantalEieren + " eieren";
	}
}
