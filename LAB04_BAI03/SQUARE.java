package LAB04_BAI03;

 class SQUARE extends RECTANGLE {
	public SQUARE () {
		super();
	}
	public SQUARE(double side) {
		super(side, side);
	}
	public SQUARE(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	public double getSIDE() {
		return getWIDTH();
	}
	public void setSIDE(double side) {
		setWIDTH(side);
		setLENGTH(side);
	}
	public String toString() {
		return "Square: " + getSIDE() + " - " + super.toString();
	}
}
