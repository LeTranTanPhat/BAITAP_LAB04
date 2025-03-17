package LAB04_BAI05;

class SACHVANHOC extends SACH {
	private int lanxuatban;
	
	public SACHVANHOC() {
		super();
		this.lanxuatban = 0;
	}
	public SACHVANHOC(String masach, String tensach, String tacgia, long gia, int lanxuatban) {
		super(masach,tensach,tacgia,gia);
		this.lanxuatban = lanxuatban;
	}
	public int getLANXUATBAN() {
		return lanxuatban;
	}
	public long getGIASAUGIAM() {
		return getGIA() > 300000 ?(long) (getGIA() * 0.8) : getGIA();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Lan xuat ban: "+lanxuatban);
	}
}
