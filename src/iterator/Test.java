package iterator;

public class Test {
	public static void main(String[] args) {
		IterableCollection ic = new AnimalCollection("Bird", "Parrot", "Tiger", "Dog");
		MyIterator it = ic.createIterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.first());
		System.out.println(it.isDone());
		System.out.println(it.currentItem());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.isDone());


	}
}
