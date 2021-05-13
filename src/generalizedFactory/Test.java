package generalizedFactory;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		String className = null;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			String input = (s.nextLine()).toString();
			
			if (input.equals("Parrot")) {
				className = "Parrot";
			} else if (input.equals("Tiger")) {
				className = "Tiger";
			} else {
				i--;
				continue;
			}
			Animal anim = AnimalFactory.newInstance(className, className+i);
			
			anim.animalPrintGreeting();
			anim.animalPrintMenu();
			
			System.out.println();
		}
	}
}
