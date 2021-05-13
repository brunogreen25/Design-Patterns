package observer;

public class Test {

	public static void main(String[] args) {
		MessageBoard messageBoard = new MessageBoard();
		
		Student jim = new Student("Jim", "O'Riley");
		jim.setMessageBoard(messageBoard);
		Student martha = new Student("Martha", "Steward");
		martha.setMessageBoard(messageBoard);
		Student john = new Student("John", "Doe");
		john.setMessageBoard(messageBoard);
		
		Professor silvester = new Professor("Silvester", "Stalone");
		silvester.setMessageBoard(messageBoard);
		
		messageBoard.addMessage("The Wellcome Day is due to 25 of August.");
		
		silvester.removeMessageBoard();
		messageBoard.addMessage("The party starts at 7 P.M.");
	}

}
