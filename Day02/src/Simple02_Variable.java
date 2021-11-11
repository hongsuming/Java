
public class Simple02_Variable {

	public static void main(String[] args) {
		// 0. 변수의 사용
		// 선언 : 타입 변수명;
		int num;
//		System.out.println(num); 선언 후 초기화 후 사용해야 됨 안 그럼 에러남!
		// 초기화
		num = 10;
		// 사용
		System.out.println(num);
		// 변경
		num = 20;
		System.out.println(num);

		
		// 선언과 동시에 초기화
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
		
		// 에러
//		byte testByte = 300; > byte는 -127~128까지의 정수만 표현 크기가 맞지 않아서 에러남
//		int testLong = 123L; > int는 4바이트 / long은 8바이트 크기가 맞지 않아서 에러남
//		float testFloat = 3.14; > double은 4바이트 / float는 8바이트 크기가 맞지 않아서 에러남
//		char testChar = "A";    > char은 ''로 표기
//		boolean testBoolean = TRUE; > 소문자로 표기해야 됨
//		boolean testBoolean2 = 0;   > true | false 둘 중 하나만 들어갈 수 있음
		
		
		// 변수는 소문자로 시작 낙타 표기법!
		// 홍길동 20세 서울 성별(남) 결혼여부(false) 키(185.63) 체중(78.25)
		// 1. 변수 선언
		String name;			// 참조형 변수
		int age;
		String address;			// 참조형 변수
		char gender;
		boolean isMarried;
		float height;
		double weight;
		
		// 2. 변수 초기화
		name = "홍길동";
		age = 20;
		address = "서울";
		gender = '남';
		isMarried = false;
		height = 185.63f;
		weight = 78.25;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(isMarried);
		System.out.println(height);
		System.out.println(weight);
		
		
		
	} // main 끝 - 프로그램 종료

}
