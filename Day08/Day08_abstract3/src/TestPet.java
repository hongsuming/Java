
public class TestPet {

	public static void main(String[] args) {
		
		
		Pet c = new Cat("나비", 3, "암컷");
		System.out.println(c);
		c.cry();
		c.eat();
		c.sleep();
		Cat c2 = (Cat) c;
	    System.out.println(c2.getGender());
		
		Pet d = new Dog("하루", 2, "블랙");
		System.out.println(d);
		d.cry();
		d.eat();
		d.sleep();
		Dog d2 = (Dog) d;
		System.out.println(d2.getColor());
			
		Pet pets[] = {c,d};
		
		System.out.println("for each문----------------");
		for (Pet pet : pets) {
			System.out.println(pet);
		}
		System.out.println("일반 for문----------------");
		for(int i=0; i<pets.length; i++) {
			System.out.println(pets[i]);
		}

	}

}
