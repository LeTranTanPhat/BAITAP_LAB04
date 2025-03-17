package LAB04_BAI01;

 class Cylinder extends Circle {
	 private double height = 1.0;
	 
	 public Cylinder() {
		 super();
		 this.height = 1.0;
	 }
	 public Cylinder(double radius) {
		 super(radius);
		 this.height = 1.0;
	 }
	 public Cylinder(double radius, double height) {
		 super(radius);
		 this.height = height;
	 }
	 public Cylinder(double radius, double height, String color) {
		 super(radius, color);
		 this.height = height;
	 }
	 public double getHEIGHT() {
		 return height;
	 }
	 public void setHEIGHT(double height) {
		 this.height = height;
	 }
	 public double getVOLUME() {
		 return getAREA() * height;
	 }
	 public String toString() {
		 return super.toString() + ", height = " + height;
	 }

}
