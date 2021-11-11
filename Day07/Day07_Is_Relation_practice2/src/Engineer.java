
public class Engineer extends Employee{
	
	String skill;


	public Engineer() {
		super();
		System.out.println("Engineer 기본 생성자");
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	

}
