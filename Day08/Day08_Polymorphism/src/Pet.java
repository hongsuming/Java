
public class Pet {

	String name;
	int age;

	public void cry() {
		System.out.println("pet 울기~");
	}
	public void eat() {
		System.out.println("pet 사료 먹기");
	}
	public void sleep() {
		System.out.println("pet 쿨쿨~");
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
