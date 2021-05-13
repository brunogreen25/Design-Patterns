package command;

//Invoker
public class Button {
	
	Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand() {
		command.execute();
	}
}
