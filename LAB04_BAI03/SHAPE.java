package LAB04_BAI03;

public class SHAPE {
	private String color = "red";
	private boolean filled = true;
	
	public SHAPE() {
		this.color = "red";
		this.filled = true;
	}
	public SHAPE(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getCOLOR() {
		return color;
	}
	public void setCOLOR(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFILLED(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "Shape: " + color + " - " + filled;
	}
}

