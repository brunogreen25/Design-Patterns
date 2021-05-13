package flyweight;

public class IntrinsicState {
	private boolean hasHead;
	private boolean hasTorso;
	private int armNumber;
	private int legNumber;
	
	public IntrinsicState(boolean hasHead, boolean hasTorso, int armNumber, int legNumber) {
		this.hasHead = hasHead;
		this.hasTorso = hasTorso;
		this.armNumber = armNumber;
		this.legNumber = legNumber;
	}

	public boolean isHasHead() {
		return hasHead;
	}

	public void setHasHead(boolean hasHead) {
		this.hasHead = hasHead;
	}

	public boolean isHasTorso() {
		return hasTorso;
	}

	public void setHasTorso(boolean hasTorso) {
		this.hasTorso = hasTorso;
	}

	public int getArmNumber() {
		return armNumber;
	}

	public void setArmNumber(int armNumber) {
		this.armNumber = armNumber;
	}

	public int getLegNumber() {
		return legNumber;
	}

	public void setLegNumber(int legNumber) {
		this.legNumber = legNumber;
	}
}
