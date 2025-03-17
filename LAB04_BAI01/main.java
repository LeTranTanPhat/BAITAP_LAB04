package LAB04_BAI01;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cle = new Circle(2.0, "blue");
		System.out.println(cle);
		System.out.println("Dien tich cua hinh tron = " + cle.getAREA());
		
		Cylinder cyl = new Cylinder(2.0, 3.0, "green");
		System.out.println(cyl);
		System.out.println("The tich = " +cyl.getVOLUME());
	}

}
