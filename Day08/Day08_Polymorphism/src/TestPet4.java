
public class TestPet4 {
	
	public static void main(String[] args) {
		
		Pet pets [] = {
				new Cat("야옹이", 3, "암놈"),
				new Cat("고양이", 4, "숫놈"), 
				new Dog("누렁이", 8, "암놈", "누런색")
		};
		
		for (Pet pet : pets) {
			if(pet instanceof Cat) {
				Cat c = (Cat) pet;
				System.out.println("Cat"+c.getGender());
			} else if(pet instanceof Dog) {
				Dog d = (Dog) pet;
				System.out.println("Dog"+d.getColor());
			} else if(pet instanceof Pet) {
				System.out.println("Pet"+pet.getAge());
			}
		}
	}

}
