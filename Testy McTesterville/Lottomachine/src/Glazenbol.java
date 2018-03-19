import java.util.Random;

public class Glazenbol {
	Lottobal[] alleBallen;
	Lottobal[] overigeBallen;
	
	Glazenbol() {
		
	}
	void verzamelAlleBallen() {
		
	}
	
	void schepBal() {
		Random rand = new Random();
		int r = rand.nextInt(alleBallen.length) + 0;
		Lottobal bal =  alleBallen[r];
		System.out.println(bal);
	}
}

