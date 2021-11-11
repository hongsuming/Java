
public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 10, "서울");
		System.out.println(p1.name+"\t"+p1.age+"\t"+p1.address);
		Person p2 = new Person();
		p2.name="홍수민";
		p2.age=24;
		p2.address="천호";
//		System.out.println(p2.name+"\t"+p2.age+"\t"+p2.address);
//		p2 = new Person();
//		System.out.println(p2.name+"\t"+p2.age+"\t"+p2.address);
		System.out.println(p2);
		System.out.println(p1.toString());
	}

}
