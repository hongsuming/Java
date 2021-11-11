
public class Manager extends Employee{
	
	String depart;


	public Manager() {
		super();
	}

	public Manager(String name, String ssn, String address, String depart) {
		//super(name, ssn, address); -> 부모 매개변수 3개짜리 생성자
		// 아래 건 super();와 같음
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	

}
