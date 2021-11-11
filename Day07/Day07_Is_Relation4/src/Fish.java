
public class Fish extends Pet{
	

	private double tailSize;
	
	
	
	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fish(String name, int age, double tailSize) {
		super();
		this.name = name;
		this.age = age;
		this.tailSize = tailSize;
	}

	@Override
	public void cry() {
		//super.cry();
		System.out.println("Fish 울기");
	}
	@Override
	public void eat() {
		//super.eat();
		System.out.println("Fish 사료먹기");
	}
	@Override
	public void sleep() {
		//super.sleep();
		System.out.println("Fish 새근새근~");
	}
	public void swimFish() {
		System.out.println("어푸어푸~");
	}
	
	public double getTailSize() {
		return tailSize;
	}
	public void setTailSize(double tailSize) {
		this.tailSize = tailSize;
	}
	
	
	@Override
	public String toString() {
		return "Fish [name=" + name + ", age=" + age + ", tailSize=" + tailSize + "]";
	}

	
	

}
