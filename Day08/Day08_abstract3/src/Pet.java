
public abstract class Pet {
	
	private String name;
	private int age;
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public abstract void cry();
	public abstract void eat();
	public abstract void sleep();
	
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
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age;
	}
	
	

}
