
public class Main {
	//Opgave B

	public static void main(String[] args) {
		Docent d = new Docent("Janssen", "Jan", "123");
		Student s = new Student("Pietersen", "Piet", 987, d);
		System.out.println(d);
		System.out.println(s);
	}

}
