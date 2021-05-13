package prototype;

import java.util.List;

public abstract class CloneableObject {
	protected String name;
	protected String id;
	
	public abstract CloneableObject copy();
}
