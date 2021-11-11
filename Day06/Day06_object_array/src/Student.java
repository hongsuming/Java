
public class Student {
	// 멤버변수
	private String name;
	private int age;
	private String address;
	
	// 생성자
	public Student() {
	}
	public Student(String name, int age) {
		this(name, age, null);
	}
	public Student(String name, String address) {
		this(name, 20, address);
	}
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	// get, set 함수
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
	
	// toString 함수
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}


}
