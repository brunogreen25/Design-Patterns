package chainOfResponsibility;

public enum TaskComplexityLevel {
	LOW(0),
	INTERMEDIATE(1),
	HIGH(2),
	ADVANCED(3);
	
	private final int value;
	
	TaskComplexityLevel(final int newValue) {
		value = newValue;
	}
	
	public int getValue() {
		return value;
	}
}
