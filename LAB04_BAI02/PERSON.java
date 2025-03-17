package LAB04_BAI02;

public class PERSON {
	private String name;
	private String address;
	public PERSON(String name, String address) {
		this.name = name;	
		this.address = address;
	}
	public String getNAME() {
		return name;
	}
	public String getADDRESS() {
		return address;
	}
	public void setADDRESS(String address) {
		this.address = address;
	}
	public String toString() {
		return "Person: " + name + " - " + address;
	}
}
