package memento;

public class Test {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker(originator, null);
		
		String message1 = "Hello, this conversation will be recorded.";
		System.out.println(message1);
		caretaker.addToHistory(message1);
		
		
		String message2 = "I am a low-level AI bot.";
		System.out.println(message2);
		caretaker.addToHistory(message2);
		
		String message3 = "If you don't believe me that this is recored here is a history";
		System.out.println(message3);
		caretaker.addToHistory(message3);
		
		System.out.println();
		System.out.println();
		
		while(!caretaker.isHistoryEmpty()) {
			System.out.println(caretaker.undo());
		}
	}
}
