
public class Student {
	
	// 멤버변수
	String name;
	int age;
	String address;
	
	// 주의 !!
	// 매개변수가 있는 생성자를 명시적으로 오버로딩에는
	// 기본생성자 자동 삽입을 하지 않아서 직접 기본 생성자를 명시해야 됨
	public Student() {
		
	}
	
	// 다르게 설정해서 구분
	public Student(String name) {
		System.out.println("Student(String name) 호출됨");
		this.name=name; // this=인스턴스(멤버) 변수
	}
	
	// 생성자의 오버로딩(over loading) : 생성자의 매개변수를
	public Student(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
}
