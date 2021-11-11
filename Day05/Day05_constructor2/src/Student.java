
public class Student {
	
	// 멤버변수
	String name;
	int age;
	String address;

	// 묵시적 기본 생성자
	
	// 명시적으로 생성자 작성
	// - 접근 제한자 클래스이름(인자){}
	public Student() { // 인자(매개변수)가 없는 생성자를 '기본 생성자'라고 부름
		System.out.println("생성자가 호출됨 ------------------------");
	}
}
