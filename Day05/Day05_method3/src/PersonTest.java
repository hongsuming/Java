
public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍수민", 24);
		System.out.println(p1);
		Person p2 = new Person();
		System.out.println(p2);
		p2.setName("김진석");
		p2.setAge(23);
		System.out.println(p2);
		p2.setName("홍수민");
		p2.setAge(24);
		System.out.println(p2);
		System.out.println(p1==p2);
		

	}

}
