package LAB04_BAI05;

public class SACHGIAOKHOA extends SACH {
	private int lop;
	private String nhaxuatban;
	
	public SACHGIAOKHOA() {
		super();
		this.lop = 0;
		this.nhaxuatban = "";
	}
	public SACHGIAOKHOA(String masach, String tensach, String tacgia, long gia, int lop, String nhaxuatban) {
		super(masach, tensach, tacgia, gia);
		this.lop = lop;
		this.nhaxuatban = nhaxuatban;
	}
	public int getLOP() {
		return lop;
	}
	public String getNHAXUATBAN() {
		return nhaxuatban;
	}
	public long getGIASAUGIAM() {
		return nhaxuatban.equals("Giao duc") ? (long) (getGIA() * 0.9) : getGIA();
		
	}
	public void xuat() {
		super.xuat();
		System.out.println("Lop: " + lop + " - Nha xuat ban: "+nhaxuatban);
		
	}
}
