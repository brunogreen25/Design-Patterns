package command;

public class TurnOnCommand implements Command {
	private Projection projection;
	
	public TurnOnCommand(Projection projection) {
		this.projection = projection;
	}
	
	@Override
	public void execute() {
		projection.turnOn();	
	}
}
