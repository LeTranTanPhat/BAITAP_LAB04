package LAB04_BAI03;

 class RECTANGLE extends SHAPE {
	 private double width = 1.0;
	 private double length = 1.0;
	 
	 public RECTANGLE() {
		 super();
	 }
	 public RECTANGLE(double width, double length) {
		 super();
		 this.width = width;
		 this.length = length;
	 }
	 public RECTANGLE(double width, double length, String color, boolean filled) {
		 super(color, filled);
		 this.width = width;
		 this.length = length;
	 }
	 public double getWIDTH() {
		 return width;
	 }
	 public void setWIDTH(double width) {
		 this.width = width;
	 }
	 public double getLENGTH() {
		 return length;
	 }
	 public void setLENGTH(double length) {
		 this.length = length;
	 }
	 public double getAREA() {
		 return width * length;
	 }
	 public double getPERIMETER() {
		 return 2 * (width + length);
	 }
	 public String toString() {
		 return "Rectangle: " + width + " - " + length + " - " + super.toString();
	 }
}
