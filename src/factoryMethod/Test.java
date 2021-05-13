package factoryMethod;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		AnimalCreator tc = new TigerCreator();
		Scanner sc = new Scanner(System.in);
		Animal animal = null;
		
		for (int i=0;i<5;i++) {
			String input = sc.next();
			if (input.equals("Parrot")) {
				tc = new ParrotCreator();
			} else if (input.equals("Tiger")) {
				tc = new TigerCreator();
			} else {
				System.out.println("Invalid input!");
			}
			
			animal = tc.factoryMethod();
			System.out.println(animal.printGreeting());
			System.out.println(animal.printMenu());
			
			System.out.println();
		}
	}
}
