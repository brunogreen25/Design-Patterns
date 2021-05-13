package generalizedFactory;

import java.lang.reflect.Constructor;

public class AnimalFactory {
	public static Animal newInstance(String animalKind, String name) throws Exception {
		Class<Animal> animalClass = (Class<Animal>) Class.forName("generalizedFactory." + animalKind);
		Constructor<Animal> animalConstructor = animalClass.getConstructor(String.class);
		Animal animalObj = animalConstructor.newInstance(name);
		
		return animalObj;
	}
}

