
public class Employee {
	
	String ssn;
	String name;
	String address;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String ssn, String name, String address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmployee() {
		return "[ssn=" + ssn + ", name=" + name + ", address=" + address ;
	}
	
	
	
	

}
