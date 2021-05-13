package factoryMethod;

public abstract class Animal {
	protected String name;
	protected static Integer id = 1;
	
	public abstract String printGreeting();
	public abstract String printMenu();
}
