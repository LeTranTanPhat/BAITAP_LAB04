package LAB04_BAI02;

 class STAFF extends PERSON {
	 private String school;
	 private double pay;
	 
	 public STAFF(String name, String address, String school, double pay) {
		 super(name, address);
		 this.school = school;
		 this.pay = pay;
	 }
	 public String getSCHOOL() {
		 return school;
	 }
	 public void setSCHOOL(String school) {
		 this.school = school;
	 }
	 public double getPAY() {
		 return pay;
	 }
	 public void setPAY(double pay) {
		 this.pay = pay;
	 }
	 public String toString() {
		 return "Staff: " + "(" + super.toString() + " - " + school + " - " + pay+")";
	 }

}
