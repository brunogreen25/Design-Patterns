package chainOfResponsibility;

public class Request {
	private TaskComplexityLevel lvl;
	private String task;
	
	public Request(TaskComplexityLevel lvl, String task) {
		this.lvl = lvl;
		this.task = task;
	}
	
	public TaskComplexityLevel getLevel() {
		return this.lvl;
	}
	
	public String getTask() {
		return this.task;
	}
}
