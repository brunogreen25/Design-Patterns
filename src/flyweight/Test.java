package flyweight;

import java.awt.Color;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person(new ExtrinsicState(Color.BLACK, Color.BLUE, "John"), new IntrinsicState(true, true, 2, 2));
		Person p2 = new Person(new ExtrinsicState(Color.BLUE, Color.RED, "Jessica"), new IntrinsicState(true, true, 2, 2));
		Person p3 = new Person(new ExtrinsicState(Color.BLUE, Color.BLACK, "Julia"), new IntrinsicState(true, true, 2, 2));
		Person p4 = new Person(new ExtrinsicState(Color.RED, Color.BLUE, "Jake"), new IntrinsicState(true, true, 2, 2));
		Person p5 = new Person(new ExtrinsicState(Color.RED, Color.BLACK, "Jimmey"), new IntrinsicState(true, true, 1, 2));
		Person p6 = new Person(new ExtrinsicState(Color.BLACK, Color.RED, "Justin"), new IntrinsicState(true, true, 2, 3));
		Person p7 = new Person(new ExtrinsicState(Color.RED, Color.BLACK, "Julio"), new IntrinsicState(true, true, 1, 2));
		Person p8 = new Person(new ExtrinsicState(Color.BLACK, Color.BLUE, "Jemmy"), new IntrinsicState(true, true, 2, 3));
		
		p1.printStats();
		p2.printStats();
		p3.printStats();
		p4.printStats();
		p5.printStats();
		p6.printStats();
		p7.printStats();
		p8.printStats();
		
		
	}
}
