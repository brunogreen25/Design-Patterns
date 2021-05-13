package factoryMethod;

public class Tiger extends Animal {
	public Tiger() {
		super();
		super.name = "Tiger" + super.id.toString();
		super.id++;
	}

	@Override
	public String printGreeting() {
		return super.name + " says Tigerrrrrrr!";
	}

	@Override
	public String printMenu() {
		return super.name + " likes Tiger food!";
	}
}
