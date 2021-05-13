package generalizedFactory;

public class Tiger extends Animal {

	private String animalName;

	public Tiger(String name) {
		animalName = name;
	}

	@Override
	public String name() {
		return animalName;
	}

	@Override
	public String greet() {
		return "Roaaar!";
	}

	@Override
	public String menu() {
		return "samo meso";
	}

}