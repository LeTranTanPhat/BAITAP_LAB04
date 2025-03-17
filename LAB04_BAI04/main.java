package LAB04_BAI04;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		HANGDIENMAY dienmay = new HANGDIENMAY("DM001", "Tivi",5000000, 12, 220, 100);
		System.out.println("\nThong tin hang dien may: ");
		dienmay.xuat();
		
		System.out.print("\nNhap thong tin hang dien may moi: ");
		HANGDIENMAY dienmaymoi = new HANGDIENMAY();
		dienmaymoi.nhap();
		System.out.println("\nThong tin hang dien may moi: ");
		dienmaymoi.xuat();
		
		HANGTHUCPHAM thucpham = new HANGTHUCPHAM("TP001", "Gao", 20000, "01/03/2025", "01/09/2025");
		System.out.println("\nThong tin hang thuc pham: ");
		thucpham.xuat();
		
		System.out.print("\nNhap thong tin hang thuc pham moi: ");
		HANGTHUCPHAM thucphammoi = new HANGTHUCPHAM();
		thucphammoi.nhap();
		System.out.println("\nThong tin hang thuc pham moi: ");
		thucphammoi.xuat();
	}

}
