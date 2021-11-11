
public class Student {
	// 정보의 은닉화(encapsulation)
	// 잘못된 데이터의 객체 저장 금지 - 1. private 2. 생성자 매개변수 데이터 검사 3. 
	private String name;
	private int age;
	private String address;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String address) {
		this.name=name;
		if(age<100) {
			this.age=age;
		}
		this.address=address;
	}
	
	public String toString() {
		return this.name+"\t"+this.age+"\t"+this.address;
	}
	
	// get, setXXX 함수 작성 - 함수 이름 주의
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if(name.length()<5) {
		this.name=name;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age>0&&age<150) {
		this.age=age;
		}
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}



	

}
