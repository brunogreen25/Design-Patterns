package chainOfResponsibility;

public abstract class BaseHandler implements Handler {
	
	private Handler next;
	
	@Override
	public final void setNext(Handler handler) {
		this.next = handler;
	}
	
	@Override
	public void handle(Request request) {
		if (next != null) {
			next.handle(request);
		}
	}
}
