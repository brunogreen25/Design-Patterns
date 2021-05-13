package command;

public class Test {
	public static void main(String[] args) {
		Button button = new Button();
		Projection projection = new Projection();
		
		Command displayCommand = new DisplayCommand(projection, "Hello World!");
		button.setCommand(displayCommand);
		button.executeCommand();
		
		Command turnOnCommand = new TurnOnCommand(projection);
		button.setCommand(turnOnCommand);
		button.executeCommand();
		
		button.setCommand(displayCommand);
		button.executeCommand();
		
		Command turnOffCommand = new TurnOffCommand(projection);
		button.setCommand(turnOffCommand);
		button.executeCommand();
		
		button.setCommand(displayCommand);
		button.executeCommand();
	}
}
