
public class Cat extends Pet{

	private String gender;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}

	@Override
	public void cry() {
		System.out.println("Cat 야옹");
	}

	@Override
	public void eat() {
		System.out.println("Cat 사료먹기");
	}

	@Override
	public void sleep() {
		System.out.println("Cat 쿨쿨");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return super.toString()+", gender=" + gender + "]";
	}


	
	
}
