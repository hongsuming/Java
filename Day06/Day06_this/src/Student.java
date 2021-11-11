
public class Student {
	// 멤버변수
	private String name;
	private int age;
	private String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name) {
		//super();
		this(name, 0);
	}
	public Student(String name, int age) {
		//super();
		this(name, age, null);
	}
	public Student(String name, int age, String address) {
		super(); // 상속과 관련, 부모 생성자 호출 코드 - jdk 묵시적 삽입
		System.out.println("Student(String name, int age, String address) 생성자 호출");
		this.name = name;
		this.age = age;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}


	


}
