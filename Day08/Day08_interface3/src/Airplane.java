
public class Airplane implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("비행기가 이륙한다.");
	}

	@Override
	public void land() {
		System.out.println("비행기가 착륙한다.");
	}

	@Override
	public void fly() {
		System.out.println("비행기가 날아간다.");
	}

	
}
