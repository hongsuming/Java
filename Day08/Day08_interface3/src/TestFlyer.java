
public class TestFlyer {

	public static void main(String[] args) {
		
		Flyer b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		Flyer m = new SuperMan();
		m.takeOff();
		m.fly();
		m.land();
		
		Flyer a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
		
		Flyer flyers[] = {b, m, a};
		for (Flyer flyer : flyers) {
			flyer.fly();
		}

	}

}
