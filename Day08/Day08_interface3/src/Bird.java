
public class Bird implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("참새가 이륙한다.");
	}

	@Override
	public void land() {
		System.out.println("참새가 착륙한다.");
	}

	@Override
	public void fly() {
		System.out.println("참새가 날아간다.");
	}

}
