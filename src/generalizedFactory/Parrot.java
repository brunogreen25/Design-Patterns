package generalizedFactory;

public class Parrot extends Animal {

	private String animalName;

	public Parrot(String name) {
		animalName = name;
	}

	@Override
	public String name() {
		return animalName;
	}

	@Override
	public String greet() {
		return "Parrottt!";
	}

	@Override
	public String menu() {
		return "samo odabranu hranu";
	}

}