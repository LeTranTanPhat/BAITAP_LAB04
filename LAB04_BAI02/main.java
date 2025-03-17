package LAB04_BAI02;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PERSON person = new PERSON("Nguyen Van Phep", "123 Le Van Sy");
		System.out.println(person);
		
		STUDENT student = new STUDENT("Nguyen Thi No", "456 Cong Hoa", "Computer Science", 2, 5000.0);
		System.out.println(student);
		
		STAFF staff = new STAFF("Anh Huynh", "789 Cao Thang", "Tech University",60000.0 );
		System.out.println(staff);
		
		person.setADDRESS("999 Tran Hung Dao");
		student.setPROGRAM("Soft engineering");
		student.setFEE(5500.0);
		staff.setPAY(65000.0);
		
		System.out.println("\nSau khi cap nhat thong tin: ");
		System.out.println(person);
		System.out.println(student);
		System.out.println(staff);
	}

}
