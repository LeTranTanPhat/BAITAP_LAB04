package LAB04_BAI01;

public class Circle {
	private double radius =1.0;
	private String color = "red";
	
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRADIUS() {
		return radius;
	}
	public String getCOLOR() {
		return color;
	}
	public void setRADIUS(double radius) {
		this.radius = radius;
	}
	public void setCOLOR(String color) {
		this.color = color;
	}
	public double getAREA() {
		return Math.PI * radius * radius;
	}
	public String toString() {
		return "Circle ( radius = " + radius + ", color: " +color+ ")";
	}
}



