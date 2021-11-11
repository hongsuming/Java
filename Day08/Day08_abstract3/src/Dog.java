
public class Dog extends Pet{

	private String color;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void cry() {
		System.out.println("Dog 멍멍");
	}

	@Override
	public void eat() {
		System.out.println("Dog 사료먹기");
	}

	@Override
	public void sleep() {
		System.out.println("Dog 쿨쿨");
	}


	@Override
	public String toString() {
		return super.toString()+", color=" + color + "]";
	}


	
}
