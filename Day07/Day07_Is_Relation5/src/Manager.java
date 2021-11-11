
public class Manager extends Employee{
	
	String depart;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Manager(String ssn, String name, String address, String depart) {
		super(ssn, name, address);
		this.depart = depart;
	}


	public String getDepart() {
		return depart;
	}


	public void setDepart(String depart) {
		this.depart = depart;
	}


	public String getEmployee() {
		return super.getEmployee()+", depart="+depart+"]";
	}
	
	

}
