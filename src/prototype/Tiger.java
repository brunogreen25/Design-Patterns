package prototype;

public class Tiger extends CloneableObject {
	
	public Tiger(String name, String id) {
		super();
		super.name = name;
		super.id = id;
	}

	@Override
	public CloneableObject copy() {
		CloneableObject cloneable = new Tiger(new String(this.name), new String(this.id));
		return cloneable;
	}
	
	@Override
	public String toString() {
		return "Tiger: " + this.name + " " + this.id;
	}

}
