package command;

public class TurnOffCommand implements Command {

	private Projection projection;
	
	public TurnOffCommand(Projection projection) {
		this.projection = projection;
	}
	
	@Override
	public void execute() {
		projection.turnOff();	
	}
	
}
