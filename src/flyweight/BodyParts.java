package flyweight;

public class BodyParts {
	
	private IntrinsicState intrinsicState;
	
	public BodyParts(IntrinsicState intrinsicState) {
		this.intrinsicState = intrinsicState;
	}
	
	public void printStats(ExtrinsicState extrinsicState) {
		System.out.println("REPEATABLE FEATURES");
		System.out.println("Has head: " + this.intrinsicState.isHasHead());
		System.out.println("Has torso: " + this.intrinsicState.isHasTorso());
		System.out.println("Arm count: " + this.intrinsicState.getArmNumber());
		System.out.println("Leg count: " + this.intrinsicState.getLegNumber());
		System.out.println();
		System.out.println("INDIVIDUAL FEATURES");
		System.out.println("Eye color: " + extrinsicState.getEyeColor());
		System.out.println("Hair color: " + extrinsicState.getHairColor());
		System.out.println("Name: " + extrinsicState.getName());
	}
}
