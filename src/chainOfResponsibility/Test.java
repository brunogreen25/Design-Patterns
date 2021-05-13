package chainOfResponsibility;

public class Test {
	public static void main(String[] args) {
		Handler h1 = new ServiceDeskWorker("Katrina");
		Handler h2 = new Programmer("John");
		Handler h3 = new Programmer("Sophia");
		Handler h4 = new DataScientist("William");
		Handler h5 = new Ceo("Vanessa");
		
		h1.setNext(h2);
		h2.setNext(h3);
		h3.setNext(h4);
		h4.setNext(h5);
		//not needed, since "null" is the default value
		//h5.setNext(null);
		
		h1.handle(new Request(TaskComplexityLevel.LOW, "Call the minister"));
		h1.handle(new Request(TaskComplexityLevel.INTERMEDIATE, "Add new features"));
		h1.handle(new Request(TaskComplexityLevel.HIGH, "Publish the GAN model online"));
		h1.handle(new Request(TaskComplexityLevel.ADVANCED, "Create a new meeting"));
	}
}
