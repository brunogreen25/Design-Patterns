package decorator;

import java.util.List;

public abstract class Decorator implements Operation {
	Operation operation;
	
	public Decorator(Operation op) {
		this.operation = op;
	}
	
	public List<Float> getNumbers() {
		return operation.getNumbers();
	}
	
	public void printNumbers() {
		for(Float number: getNumbers()) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
