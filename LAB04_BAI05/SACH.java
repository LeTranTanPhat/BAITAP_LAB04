package LAB04_BAI05;
import java.util.Scanner;

public class SACH {
	private String masach;
	private String tensach;
	private String tacgia;
	private long gia;
	
	public SACH() {
		this.masach = "";
		this.tensach = "";
		this.tacgia = "";
		this.gia = 0;
	}
	public SACH(String masach, String tensach, String tacgia, long gia) {
		this.masach = masach;
		this.tensach = tensach;
		this.tacgia = tacgia;
		this.gia = gia;
	}
	public String getMASACH() {
		return masach;
	}
	public String getTENSACH() {
		return tensach;
	}
	public String getTACGIA() {
		return tacgia;
	}
	public long getGIA() {
		return gia;
	}
	public long getGIASAUGIAM() {
		return gia;
	}
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Nhap ma sach: ");
		masach = kb.nextLine();
		System.out.println("Nhap ten sach: ");
		tensach = kb.nextLine();
		System.out.println("Nhap tac gia: ");
		tacgia = kb.nextLine();
		System.out.println("Nhap gia: ");
		gia = kb.nextLong();
	}
	public void xuat() {
		System.out.println("Ma sach: " + masach + " - Ten sach: "+ tensach + " - Tac gia: "+ tacgia + " - Gia: ");
	}
	
}
