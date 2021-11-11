import java.util.Date;

public class TestStudent {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d); // d.toString() 묵시적 호출
		System.out.println(d.toString()); // 명시적 호출
		
		Integer i = new Integer(100);
		System.out.println(i); // 문자열 100 리턴
		System.out.println(i.toString());
		
		Student s = new Student("홍길동", 20, "서울");
		System.out.println(".."+s); // = ㄴ
		System.out.println(s.toString());
		System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		System.out.println();
	}

}
