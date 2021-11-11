
public class Manager extends Employee{
	
	String depart;


	public Manager() {
		super("A", "B", "C"); // 부모의 매개변수 3개짜리 생성자 명시적 호출
		System.out.println("Manager 기본 생성자");
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	

}
