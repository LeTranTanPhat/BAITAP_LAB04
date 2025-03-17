package LAB04_BAI05;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		SACHVANHOC vanhoc = new SACHVANHOC("VH001", "Truyen Kieu", "Nguyen Du", 400000,5);
		SACHGIAOKHOA giaokhoa = new SACHGIAOKHOA("GK001", "Toan 10", "Hoang Xuan", 250000, 10, "Giao Duc");
		
		System.out.println("Thong tin sach van hoc: ");
		vanhoc.xuat();
		System.out.println("Gia sau giam: " +vanhoc.getGIASAUGIAM());
		
		System.out.println("\nThong tin sach giao khoa: ");
		giaokhoa.xuat();
		System.out.println("Gia sau giam: " + giaokhoa.getGIASAUGIAM());
	}

}
