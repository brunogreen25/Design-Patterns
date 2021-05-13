package decorator;

import java.util.*;

//Concrete Component
public class PrintNumbers implements Operation {
	List<Float> numbers;
	
	public PrintNumbers(List<Float> numbers) {
		this.numbers = numbers;
	}
	
	public void doOperation() {
		System.out.println("START OPERATIONS");
		for(Float number: getNumbers()) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
	
	@Override
	public List<Float> getNumbers() {
		return numbers;
	}
}
