package flyweight;

import java.awt.Color;

public class Person {
	
	private ExtrinsicState extrinsicState;
	private BodyParts bodyParts;
	
	private BodyPartsFactory bodyPartsFactory;
	
	public Person(ExtrinsicState extrinsicState, IntrinsicState intrinsicState) {
		this.extrinsicState = extrinsicState;
		String key = generateKey(intrinsicState);
		this.bodyParts = BodyPartsFactory.getInstance().getBodyParts(key, intrinsicState);
	}
	
	public void printStats() {
		bodyParts.printStats(extrinsicState);
	}
	
	private String generateKey(IntrinsicState intrinsicState) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.valueOf(intrinsicState.isHasHead()).substring(0, 1));
		sb.append(String.valueOf(intrinsicState.isHasTorso()).substring(0, 1));
		sb.append(String.valueOf(intrinsicState.getArmNumber()));
		sb.append(String.valueOf(intrinsicState.getLegNumber()));
		
		return sb.toString();
	}
	
	
}
