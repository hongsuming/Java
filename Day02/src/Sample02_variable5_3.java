
public class Sample02_variable5_3 { // 클래스 블럭
	// 클래스 블럭에 선언 되는 변수 : 멤버변수  = 인스턴스 변수 (instance variable) = 전역변수
	// 생명 주기 : 클래스 생성(객체 생성) ~ 클래스 종료(객체 소멸)
	// 생성 시점 : new 키워드 사용 속한 클래스를 명시적으로 객체 생성해서 사용함
	// 객체 생성한 참조 변수를 이용하고 사용
	// 로컬 변수와 다르게 초기 값을 설정하지 않아도 바로 사용할 수 있음
	String name;
	int age;
	char gender;
	float height;

	public static void main(String[] args) {
		// 함수 블럭에 선언 되는 변수 : 로컬변수 (local variable) = 지역변수
		// 생명 주기 : 메서드 호출 ~ 메서드 종료 (변수 소멸)
		// 주의할 점  : 반드시 사용 전에 초기화 해야 됨 (명시적)
		int n = 0; // 메인 함수에 선언된 로컬 변수
		System.out.println(n);

		Sample02_variable5_3 refVar = new Sample02_variable5_3(); // 객체 생성 & 멤버 변수 자동 초기화
		System.out.println(refVar);
		System.out.println(refVar.gender);
		refVar=null;
		System.out.println(refVar); // 객체를 null = 소멸 시켜서 에러 남
		refVar.name = "홍수민";
		refVar.age = 24;
		refVar.gender = '여';
		System.out.println(refVar.name + refVar.age + refVar.gender);

	} // 메인 함수 종료

} // 클래스 종료
