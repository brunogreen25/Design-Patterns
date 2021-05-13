package singleton;

public class Test {
	public static void main(String[] args) {
		NumberGenerator rnb = NumberGenerator.getInstance(); 
		for(int i=0; i<5; i++) {
			System.out.println(rnb.getNumber());
		}
	}
}
