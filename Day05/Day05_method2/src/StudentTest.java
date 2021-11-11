
public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동", 200, "서울");
		System.out.println(student1);
//		student1.age=30; private으로 막혀있어서 접근하지 못 함
		System.out.println(student1.getName());
		
		student1.setName("홍수민");
		
		System.out.println(student1.getName());
	}

}
