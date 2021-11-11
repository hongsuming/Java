
public class Employee {
	
	String name;
	String ssn;
	String address;
	
	
	public Employee() {
		System.out.println("Employee 기본 생성자 호출---------------");
	}
	public Employee(String name, String ssn, String address) {
		super();
		System.out.println("Employee (String name, String ssn, String address) 생성자 호출---------------");
		this.name = name;
		this.ssn = ssn;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
