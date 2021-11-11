
public class TestCar {

	public static void main(String[] args) {
		
		Car c = new Car(new Engine("A010", "2001"), "g80");
		Engine e = c.getEngine();
		System.out.println(e);
		System.out.println(c);
		
		Engine e2 = new Engine("B111", "2020");
		Car c2 = new Car(e2, "gv70");
		System.out.println(c2);

	}

}
