
public class Dog extends Pet{
	
	private String gender;
	private String color;
	
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int age, String gender, String color) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
	}
	
	
	public void cryDog() {
		System.out.println("Dog 멍멍~");
	}
	public void eatDog() {
		System.out.println("Dog 사료 먹기");
	}
	public void sleepDog() {
		System.out.println("Dog 쿨쿨~");
	} 
	public void runDog() {
		System.out.println("Dog 발발~");
	}
	

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", gender=" + gender + ", color=" + color + "]";
	}

	
	

}
