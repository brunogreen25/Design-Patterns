package state;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		System.out.println("Example: A -> B -> A -> C -> B");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		StateHandler stateHandler = new StateHandler();
		
		List<String> stateList = Arrays.asList(input.split(" -> "));
		stateList.forEach(state -> stateHandler.changeState(state));
	}
}
