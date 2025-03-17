package LAB04_BAI03;

 class CIRCLE extends SHAPE {
	private double radius = 1.0;
	
	public CIRCLE() {
		super();
	}
	public CIRCLE(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRADIUS() {
		return radius;
	}
	public void setRADIUS(double radius) {
		this.radius = radius;
	}
	public double getAREA() {
		return Math.PI * radius * radius;
	}
	public double getPERIMETER() {
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return "Circle: " + radius + " - " + super.toString();
	}
}
