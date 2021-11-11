
public class TestStudent {

	public static void main(String[] args) {
		
		// 객체 생성 방법
		// 1. 필요한 클래스 import (패키지가 다른 경우)
		// 2. 사용시 로컬변수 규칙을 따름
		// 	- 선언 : 클래스명 변수;
		//	- 초기화 : 변수 = new 클래스명;
		//    : 생성된 객체의 주소 지정
		// 3. 객체의 사용 : 참조변수.멤버변수이름, 참조변수.멤버메소드명()으로 사용
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.println(s1.name+"\t"+s1.age+"\t"+s1.address);
		System.out.println(s1==s2);
		
		s1.name="홍수민";
		s1.age=24;
		s1.address="성내동";
		
		s2.name="홍재훈";
		s2.age=22;
		s2.address="충주";
		
		s3.name="김진석";
		s3.age=23;
		s3.address="천호";
		
		
		System.out.println(s1.name+"\t"+s1.age+"\t"+s1.address);
		System.out.println(s2.name+"\t"+s2.age+"\t"+s2.address);
		System.out.println(s3.name+"\t"+s3.age+"\t"+s3.address);

	}

}
