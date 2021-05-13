package abstractFactory;

public class Test {

	public static void main(String[] args) {
		
		AbstractFactory dogFactory = FactoryBuilder.getFactory(AnimalType.DOG);
		Animal malt = dogFactory.getAnimal(AnimalType.MALTENESE);
		Animal ter = dogFactory.getAnimal(AnimalType.TERIER);
		
		AbstractFactory catFactory = FactoryBuilder.getFactory(AnimalType.CAT);
		Animal wildCat = catFactory.getAnimal(AnimalType.WILD_CAT);
		Animal domCat = catFactory.getAnimal(AnimalType.DOMESTIC_CAT);
		
		malt.greet();
		ter.greet();
		wildCat.greet();
		domCat.greet();
		
		System.out.println();
		System.out.println();
		
		malt.updateOnLife();
		ter.updateOnLife();
		wildCat.updateOnLife();
		domCat.updateOnLife();
		
	}

}
