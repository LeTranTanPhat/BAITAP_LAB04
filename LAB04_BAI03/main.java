package LAB04_BAI03;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SHAPE sh = new SHAPE("blue", false);
		System.out.println(sh);
		
		CIRCLE cir = new CIRCLE(2.0, "green", true);
		System.out.println(cir);
		System.out.println("Area: " + cir.getAREA());
		System.out.println("Perimeter: " + cir.getPERIMETER());
		
		RECTANGLE rec = new RECTANGLE(3.0, 4.0, "yellow", false);
		System.out.println(rec);
		System.out.println("Area: " + rec.getAREA());
		System.out.println("Perimeter: " + rec.getPERIMETER());
		
		SQUARE sq = new SQUARE(2.5, "purple", true);
		System.out.println(sq);
		System.out.println("Area: " + sq.getAREA());
		System.out.println("Perimeter: " +sq.getPERIMETER());
	}

}
