
public class TestPet {

	public static void main(String[] args) {
		
		Pet c = new Cat("야옹이", 3, "암놈");
		
		c.eat();
		c.cry();
		c.sleep();
		
		Cat c2 = (Cat) c;
		System.out.println(c2.getGender());

	}

}
