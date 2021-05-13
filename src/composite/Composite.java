package composite;

import java.util.*;

public class Composite extends Component {
	Operation operation;
	List<Component> children;

	public Composite(String numbers) {
		this.children = new ArrayList<Component>();
		setNumber(numbers);
	}
	
	@Override
	public void setNumber(String numbers) {
		this.children.add(new Number(String.valueOf(numbers.charAt(0))));
		this.operation = setOperation(String.valueOf(numbers.charAt(1)));
		
		if (numbers.length() == 3) {
			this.children.add(new Number(String.valueOf(numbers.charAt(2))));
		} else {
			this.children.add(new Composite(numbers.substring(2)));
		}
	}
	
	public Operation setOperation(String e) {
		switch (e)
		{
			case "*":
				return new Multiplication();
			case "+":
				return new Addition();
			case "/":
				return new Division();
			case "-":
				return new Subtraction();
			default:
				return null;
		}
	}

	@Override
	public String getNumber() {
		List<String> nums = new ArrayList<String>();
		children.forEach(child -> nums.add(child.getNumber()));
		return operation.doOperation(nums);
	}

}
