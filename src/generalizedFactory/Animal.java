package generalizedFactory;

public abstract class Animal {
	public abstract String name();
	public abstract String greet();
	public abstract String menu();
	
	public void animalPrintGreeting() {
		System.out.printf("%s pozdravlja %s\n", this.name(), this.greet());
	}
	
	public void animalPrintMenu() {
		System.out.printf("%s voli %s\n", this.name(), this.menu());
	}
}

