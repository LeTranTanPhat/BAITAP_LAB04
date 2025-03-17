package LAB04_BAI04;
import java.util.Scanner;

public class HANGHOA {
	private String maHang;
	private String tenHang;
	private long donGia;
	
	public HANGHOA() {
		this.maHang = "";
		this.tenHang = "";
		this.donGia = 0;
	}
	
	public HANGHOA(String maHang, String tenHang, long donGia) {
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
	}
	public String getMAHANG() {
		return maHang;
	}
	public String getTENHANG() {
		return tenHang;
	}
	public long getDONGIA() {
		return donGia;
	}
	public void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.print("\nNhap ma hang: ");
		maHang = kb.nextLine();
		System.out.print("\nNhap ten hang: ");
		tenHang = kb.nextLine();
		System.out.print("\nNhap don gia: ");
		donGia = kb.nextLong();
	}
	public void xuat() {
		System.out.println("Ma hang: "+maHang);
		System.out.println("Ten hang: "+tenHang);
		System.out.println("Don gia: "+donGia);
	}
}

