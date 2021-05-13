package command;

//ConcreteCommand
public class DisplayCommand implements Command {
	
	private Projection projection;
	String text;
	
	public DisplayCommand(Projection projection, String text) {
		this.projection = projection;
		this.text = text;
	}

	@Override
	public void execute() {
		projection.display(this.text);
	}
}
