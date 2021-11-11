
public class TestPet {

	public static void main(String[] args) {
		
		
		Cat c = new Cat("야옹이", 3, "암놈");
		Cat c2 = new Cat("하늘이", 1, "숫놈");
		Dog d = new Dog("장군이", 2, "숫놈", "갈색");
		Fish f = new Fish("골드", 1, 163.3);
		
		System.out.println(c.getName()+"\t"+c.getAge()+"\t"+c.getGender());
		c.eatCat();
		c.cryCat();
		c.sleepCat();
		
		System.out.println(c2);
		c2.eatCat();
		c2.cryCat();
		c2.sleepCat();
		
		System.out.println(d);		
		d.eatDog();
		d.cryDog();
		d.sleepDog();
		d.runDog();
		
		System.out.println(f);
		f.swimFish();




	}

}
