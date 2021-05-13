package observer;

public class Professor implements Observer {
	
	private String name;
	private String surname;
	
	private MessageBoard messageBoard;
	
	public Professor(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	@Override
	public void update() {
		String message = this.messageBoard.getMessage();
		
		System.out.println("Professor " + this.name + " " + this.surname + " has just recieved a message: " + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public MessageBoard getMessageBoard() {
		return messageBoard;
	}
	
	public void setMessageBoard(MessageBoard messageBoard) {
		if (messageBoard == null) {
			System.out.println("If you wish to remove the message board, use 'removeMessageBoard()' method.");
			return;
		}
		
		if (this.messageBoard != null) {
			this.messageBoard.unregister(this);
		}
		
		this.messageBoard = messageBoard;
		this.messageBoard.register(this);
	}
	
	public void removeMessageBoard() {
		if (this.messageBoard == null) {
			System.out.println("There is no message board attached.");
			return;
		}
		
		this.messageBoard.unregister(this);
		this.messageBoard = null;
	}

}
