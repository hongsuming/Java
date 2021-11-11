import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setTest3 {
	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<Person>();
		Person p = new Person("유관순", 17, "서울");
		set.add(new Person("홍길동", 20, "서울"));
		set.add(new Person("이순신", 44, "전라"));
		set.add(p);
		set.add(p);
		System.out.println(set);
		
		for (Person person : set) {
			System.out.println(person.getName());
		}
		System.out.println("==========================");
		
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			Person person = it.next();
			System.out.println(person.getName());
//			System.out.println(it.next().getName());
		}
	}
}
