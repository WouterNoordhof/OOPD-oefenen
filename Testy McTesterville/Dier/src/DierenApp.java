import java.util.ArrayList;

public class DierenApp {
	public static void main(String[] args) {
		Vis v = new Vis(10, 10, 17);
		Zoogdier z = new Zoogdier(20, 20, 212);
		
		v.bewegen();
		z.bewegen();
		
		ArrayList<Dier> dierentuin = new ArrayList<Dier>();
		dierentuin.add(v);
		dierentuin.add(z);
		for (Dier dier: dierentuin) {
			dier.bewegen();
			dier.plantVoort();
			
		}
		
		System.out.println(z);
		System.out.println(v);
	}
}
