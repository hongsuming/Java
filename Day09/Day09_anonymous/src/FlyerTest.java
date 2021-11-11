
public class FlyerTest {

	public static void main(String[] args) {
		
		Flyer b = new Bird();
		b.takeOff();
		
		Flyer b2 = new Flyer() {
			public void takeOff() {
				System.out.println("SuperMan takeOff");
			}
		};
		b2.takeOff();
		
		Flyer b3 = new Flyer() {
			public void takeOff() {
				System.out.println("Airplane takeOff");
			}
		};
		b3.takeOff();

	}

}
