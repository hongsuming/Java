import java.util.Arrays;

public class Ex07_8 {

	public static void main(String[] args) {
		
		Person p = new Person("홍수민", 24);
		Person p2 = new Person("홍지연", 28);
		Person p3 = new Person("홍재훈", 22);
		Person p4 = new Person("김진석", 23);
		
		Person persons[] = {p, p2, p3, p4};
		Arrays.sort(persons, new PersonComp());
		
		for (Person person : persons) {
			System.out.println(person);
		}

	}
}
