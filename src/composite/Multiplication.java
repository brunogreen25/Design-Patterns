package composite;

import java.util.List;

public class Multiplication implements Operation {

	@Override
	public String doOperation(List<String> numbers) {
		Integer result = 1;
		for(String number: numbers) {
			result *= Integer.valueOf(number);
		}
		return result.toString();
	}
	
}
