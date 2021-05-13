package decorator;

import java.util.List;

public class Sum extends Decorator {
	
	Float constant;

	public Sum(Operation op, Float constant) {
		super(op);
		this.constant = constant;
	}

	@Override
	public void doOperation() {
		List<Float> numbers = getNumbers();
		
		super.operation.doOperation();
		
		for(int i=0; i<numbers.size(); i++) {
			numbers.set(i, numbers.get(i) + constant);
		}
		
		super.printNumbers();
	}
}
