package LAB04_BAI02;

class STUDENT extends PERSON {
    private String program;
    private int year;
    private double fee;

    // Constructor có tham số
    public STUDENT(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    } 
    public String getPROGRAM() {
        return program;
    }
    public void setPROGRAM(String program) {
    	this.program = program;
    }
    public int getYEAR() {
    	return year;
    }
    public void setYEAR(int year) {
    	this.year = year;
    }
    public double getFEE() {
    	return fee;
    }
    public void setFEE(double fee) {
    	this.fee = fee;
    }
    public String toString() {
    	return "Student: " + "(" + super.toString() + " - " +program + " - " +year+")";
    }
}
 
