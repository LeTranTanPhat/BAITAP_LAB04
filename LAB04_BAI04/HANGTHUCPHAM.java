package LAB04_BAI04;
import java.util.Scanner;

public class HANGTHUCPHAM extends HANGHOA {
	private String ngaysanxuat;
	private String ngayhethan;
	
	public HANGTHUCPHAM() {
		super();
		this.ngaysanxuat = "";
		this.ngayhethan = "" ;
	}
	public HANGTHUCPHAM(String maHang, String tenHang, long donGia, String ngaysanxuat, String ngayhethan) {
		super(maHang, tenHang, donGia);
	    this.ngaysanxuat = ngaysanxuat;
	    this.ngayhethan = ngayhethan;
	}
	public String getNGAYSANXUAT() {
		return ngaysanxuat;
	}
	public String getNGAYHETHAN() {
		return ngayhethan;
	}
	public void nhap() {
		super.nhap();
		Scanner kb = new Scanner(System.in);
		System.out.print("\nNhap ngay san xuat: ");
		ngaysanxuat = kb.nextLine();
		System.out.print("\nNhap ngay het han: ");
		ngayhethan = kb.nextLine();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Ngay san xuat: "+ngaysanxuat);
		System.out.print("Ngay het han: "+ngayhethan);
	}
}
