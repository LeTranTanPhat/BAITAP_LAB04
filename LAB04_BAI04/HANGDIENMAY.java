package LAB04_BAI04;
import java.util.Scanner;

class HANGDIENMAY extends HANGHOA {
	private int thoigianbaohanh;
	private int dienap;
	private int congsuat;
	
	public HANGDIENMAY() {
		super();
		this.thoigianbaohanh = 0;
		this.dienap = 0;
		this.congsuat = 0;
	}
	public HANGDIENMAY(String maHang, String tenHang, long donGia, int thoigianbaohanh,int dienap, int congsuat) {
		super(maHang, tenHang, donGia);
		this.thoigianbaohanh = thoigianbaohanh;
		this.dienap = dienap;
		this.congsuat = congsuat;
	}
	public int getTHOIGIANBAOHANH() {
		return thoigianbaohanh;
	}
	public int getDIENAP() {
		return dienap;
	}
	public int getCONGSUAT() {
		return congsuat;
	}
	 public void nhap() {
		 super.nhap();
	        Scanner kb = new Scanner(System.in); 
	        System.out.print("\nNhap thoi gian bao hanh: ");
	        thoigianbaohanh = kb.nextInt();
	        System.out.print("\nNhap dien ap: ");
	        dienap = kb.nextInt();
	        System.out.print("\nNhap cong suat: ");
	        congsuat = kb.nextInt();
	 }
	    
	public void xuat() {
		super.xuat();
		System.out.println("Thoi gian bao hanh: " + thoigianbaohanh + " thang");
		System.out.println("Dien ap: " + dienap + "V");
		System.out.println("Cong suat: " + congsuat +"W");
	}
}
