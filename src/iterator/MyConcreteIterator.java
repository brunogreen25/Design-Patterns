package iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class MyConcreteIterator implements MyIterator {
	
	AnimalCollection iterable;
	int index = 0;
	
	public MyConcreteIterator(AnimalCollection ac) {
		this.iterable = ac;
	}

	@Override
	public String first() {
		return iterable.getAnimals().get(0);
	}

	@Override
	public String next() throws NoSuchElementException {
		if (index >= iterable.getAnimals().size()) {
			throw new NoSuchElementException();
		}
		return iterable.getAnimals().get(index++);
	}

	@Override
	public boolean isDone() {
		if (iterable.getAnimals().size() <= index) {
			return true;
		}
		return false;
	}

	@Override
	public String currentItem() {
		return iterable.getAnimals().get(index);
	}
	
}
