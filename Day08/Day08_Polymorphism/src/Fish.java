
public class Fish extends Pet{


	private double tailSize; //Fish에만 존재하는 속성 가정
	
	//동작
	public void swimFish() {
		System.out.println("어푸어푸~");
	}
	@Override
	public void cry() {
		System.out.println("fish 울기");
	}
	@Override
	public void eat() {
		System.out.println("fish 먹기");
	}
	@Override
	public void sleep() {
		System.out.println("fish 자기");
	}
	public Fish(String name, int age, double tailSize) {
		super();
		this.name = name;
		this.age = age;
		this.tailSize = tailSize;
	}
	
	public double getTailSize() {
		return tailSize;
	}
	public void setTailSize(double tailSize) {
		this.tailSize = tailSize;
	}
	
	
	
}
