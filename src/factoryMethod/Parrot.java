package factoryMethod;

public class Parrot extends Animal {
	public Parrot() {
		super();
		super.name = "Parrot" + super.id.toString();
		super.id++;
	}

	@Override
	public String printGreeting() {
		return super.name + " says Parrrrrrot!";
	}

	@Override
	public String printMenu() {
		return super.name + " likes Parrot food!";
	}
}
