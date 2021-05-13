package flyweight;

import java.awt.Color;

public class ExtrinsicState {
	private Color eyeColor;
	private Color hairColor;
	private String name;
	
	public ExtrinsicState(Color eyeColor, Color hairColor, String name) {
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.name = name;
	}

	public Color getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(Color eyeColor) {
		this.eyeColor = eyeColor;
	}

	public Color getHairColor() {
		return hairColor;
	}

	public void setHairColor(Color hairColor) {
		this.hairColor = hairColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
