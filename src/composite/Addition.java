package composite;

import java.util.List;

public class Addition implements Operation {

	@Override
	public String doOperation(List<String> numbers) {
		Integer result = 0;
		for(String number: numbers) {
			result += Integer.valueOf(number);
		}
		return result.toString();
	}

}
