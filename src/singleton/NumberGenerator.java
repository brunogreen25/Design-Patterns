package singleton;

import java.util.Random;

public class NumberGenerator {
	private NumberGenerator() {}
	
	private static NumberGenerator nb = null;
	
	public static NumberGenerator getInstance() {
		if (nb == null) { 
			nb = new NumberGenerator();
		}
		
		return nb;
	}
	
	public int getNumber() {
		Random rnd = new Random();
		return rnd.nextInt(4) + 1;
	}

}
