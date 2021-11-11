
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
	
	public void cryFish() {
		System.out.println("Fish 멍멍~");
	}
	public void eatFish() {
		System.out.println("Fish 사료 먹기");
	}
	public void sleepFish() {
		System.out.println("Fish 쿨쿨~");
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
