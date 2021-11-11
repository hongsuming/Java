
public class TestStudent2 {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20, "서울");
		Student s2 = new Student("홍길동", 20, "서울");
		
		System.out.println(s==s2);			// false
		System.out.println(s.equals(s2));	// false : 객체의 데이터를 비교하도록 재정의 필요 -> true

	}

}
