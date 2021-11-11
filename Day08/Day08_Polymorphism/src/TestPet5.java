
public class TestPet5 {
	
	public static void main(String[] args) {
		
		Pet pets [] = {
				new Cat("야옹이", 3, "암놈"),
				new Cat("고양이", 4, "숫놈"), 
				new Dog("누렁이", 8, "암놈", "누런색")
		};
		
		for (Pet pet : pets) {
			String name = pet.getName();
			int age = pet.getAge();
			if(pet instanceof Cat) {
				Cat c = (Cat) pet;
				String gender = c.getGender();
				System.out.println(name+"\t"+age+"\t"+gender);
			} else if(pet instanceof Dog) {
				Dog d = (Dog) pet;
				String gender = d.getGender();
				String color = d.getColor();
				System.out.println(name+"\t"+age+"\t"+gender+"\t"+color);
			}
		}
	}

}
