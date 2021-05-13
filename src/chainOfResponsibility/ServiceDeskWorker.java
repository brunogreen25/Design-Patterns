package chainOfResponsibility;

public class ServiceDeskWorker extends BaseHandler {
	private TaskComplexityLevel lvl = TaskComplexityLevel.LOW;
	
	private String name;
	
	public ServiceDeskWorker(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void handle(Request request) {
		if(request.getLevel().getValue() <= this.lvl.getValue()) {
			//can handle request
			System.out.println("Request handled by " + this.name + ": " + request.getTask());
		} else {
			//can't handle request
			super.handle(request);
		}
	}
}
