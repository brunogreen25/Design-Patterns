package composite;

import java.util.List;

public class Subtraction implements Operation {

	@Override
	public String doOperation(List<String> numbers) {
		Integer result = Integer.valueOf(numbers.get(0));
		for(int i=1;i<numbers.size(); i++) {
			result -= Integer.valueOf(numbers.get(i));
		}
		return result.toString();
	}

}
