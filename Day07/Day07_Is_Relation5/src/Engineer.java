
public class Engineer extends Employee{
	
	String skill;
	
	

	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engineer(String ssn, String name, String address, String skill) {
		super(ssn, name, address);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getEmployee() {
		return super.getEmployee()+", skill="+skill+"]";
	}
	
	

}
