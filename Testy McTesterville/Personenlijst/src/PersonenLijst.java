import java.util.ArrayList;

public class PersonenLijst {

	public static void main(String[] args) {
		PersonenLijst p = new PersonenLijst();

		Docent henk = new Docent("Henk", "Henkssen", "abcde");
		Docent klaas = new Docent("Klaas", "Van der Linden", "SWITCH");
		Docent piet = new Docent("Piet", "Jansen", "jnsnp");

		Student wouter = new Student("Wouter", "Noordhof", 50299, piet);
		Student marie = new Student("Marie", "Pieters", 31415, piet);
		Student jan = new Student("Jan", "de Vries", 92653, null); // nog geen SLB’er

		p.lijst.add(piet);
		p.lijst.add(marie);
		p.lijst.add(jan);
		p.lijst.add(klaas);
		p.lijst.add(wouter);
		p.lijst.add(henk);

		ArrayList<Persoon> studentenVanPiet = p.getSLBStudenten(piet);
		for (Persoon st: studentenVanPiet) {
			System.out.println(st);
		}
		

	}

	private ArrayList<Persoon> lijst;

	public PersonenLijst() {
		lijst = new ArrayList<>();
	}

	public ArrayList<Persoon> getSLBStudenten(Docent SLBer) {
		ArrayList<Persoon> lijstStuds = new ArrayList<>();
		for (Persoon p : lijst) {
			if (p.getSLBer() == SLBer) {
				lijstStuds.add(p);
			}
		}
		return lijstStuds;
	}

}
