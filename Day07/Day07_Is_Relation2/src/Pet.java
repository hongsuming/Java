
public class Pet extends Object{ // 부모 클래스 (private 멤버변수를 선언하면 자식 클래스에서 사용 못 함)
	
	String name;
	int age;
	
	
	
	public Pet() {
		super(); // 부모를 먼저 생성 되도록 super()가 부모의 기본 생성자를 자동 호출함
		// 코드 미기재시 jdk가 묵시적으로 부모 클래스를 생성하는 super()를 자식 클래스에 삽입함
		System.out.println("Pet의 기본생성자 호출------------------------------");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
