
public class Cat{
	
	private String name;
	private int age;
	private String gender;
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void cryCat() {
		System.out.println("cat 야옹~");
	}
	public void eatCat() {
		System.out.println("cat 생선 먹기");
	}
	public void sleepCat() {
		System.out.println("cat 새근새근~");
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
