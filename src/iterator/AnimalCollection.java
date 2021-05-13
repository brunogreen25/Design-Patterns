package iterator;

import java.util.*;

public class AnimalCollection implements IterableCollection {
	
	private List<String> animals;
	
	public AnimalCollection(String...animals) {
		this.animals = new ArrayList<String>();
		for(String animal: animals) {
			this.animals.add(animal);
		}
	}

	@Override
	public MyIterator createIterator() {
		MyIterator iterator = new MyConcreteIterator(this);
		return iterator;
	}
	
	public List<String> getAnimals() {
		return animals;
	}
	
}
