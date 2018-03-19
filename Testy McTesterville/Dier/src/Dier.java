
public abstract class Dier {
	protected int x, y;
	protected String naam;
	
	Dier (int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public abstract void plantVoort();
	
	public void bewegen() {
		this.x += 1;
		this.y += 1;
	}
}
