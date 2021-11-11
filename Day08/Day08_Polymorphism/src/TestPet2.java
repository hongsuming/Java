
public class TestPet2 {

	public static void main(String[] args) {
		
		Pet pets[] = {
				new Cat("야옹이", 3, "암놈"),
				new Cat("야옹이", 3, "암놈"),
				new Dog("누렁이", 8, "암놈", "검정")
		};
		
		for (Pet pet : pets) {
			pet.cry();
			if(pet instanceof Cat) {
				Cat c = (Cat) pet;
			}else if(pet instanceof Dog) {
				Dog d = (Dog) pet;
			}
		}

	}

}
