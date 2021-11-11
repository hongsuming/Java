import java.util.Comparator;

public class Person {
	
	String name;
	int age;
	
	
	public Person() {}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
}

class PersonComp implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		int result = 1;
		if(p1.age>=p2.age) result = -1; // -1 : 내림차순, 1 : 오름차순
		return result;
	}
}
