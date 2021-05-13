package decorator;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<Float> numbers = new LinkedList<Float>();
		numbers.add(3f);
		numbers.add(4f);
		numbers.add(5f);
		Operation operation = new Multiply(new Sum(new PrintNumbers(numbers), 2f), 3f);
		operation.doOperation();
		
		List<Float> nums = new LinkedList<Float>();
		nums.add(9f);
		nums.add(7f);
		nums.add(3f);
		Operation operation2 = new Multiply(new Sum(new Sum(new PrintNumbers(nums), 2f), 2f), 2f);
		operation2.doOperation();
	}
}
