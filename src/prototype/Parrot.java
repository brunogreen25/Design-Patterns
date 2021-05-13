package prototype;

import java.util.ArrayList;
import java.util.List;

public class Parrot extends CloneableObject {
	
	public Parrot(String name, String id) {
		super();
		super.name = name;
		super.id = id;
	}

	@Override
	public CloneableObject copy() {
		CloneableObject cloneable = new Parrot(new String(this.name), new String(this.id));
		return cloneable;
	}
	
	@Override
	public String toString() {
		return "Parrot: " + this.name + " " + this.id;
	}
	
}
