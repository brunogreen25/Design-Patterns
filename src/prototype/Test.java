package prototype;

public class Test {

	public static void main(String[] args) {
		Tiger tiger1 = new Tiger("Jim", "123");
		Tiger tiger2 = new Tiger("John", "234");
		Parrot parrot1 = new Parrot("Lisa", "121");
		
		System.out.println(tiger1);
		System.out.println(tiger2);
		System.out.println(parrot1);
		System.out.println();
		System.out.println();
		
		Tiger tiger3 = (Tiger) tiger1.copy();
		Tiger tiger4 = (Tiger) tiger1.copy();
		Parrot parrot2 = (Parrot) parrot1.copy();
		
		System.out.println(tiger1);
		System.out.println(tiger2);
		System.out.println(parrot1);
		System.out.println(tiger3);
		System.out.println(tiger4);
		System.out.println(parrot2);
		System.out.println();
		System.out.println();
	}

}
