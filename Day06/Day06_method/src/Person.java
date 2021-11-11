
public class Person {
	// 멤버변수
	String name;
	int age;
	String email;
	
	// 생성자
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// toString 함수
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + "]";
	}

	public String getData() {
		return this.name+"\t"+this.age+"\t"+this.email;
	}

}
