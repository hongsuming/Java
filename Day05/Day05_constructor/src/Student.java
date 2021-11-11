
public class Student {
	
	// 멤버변수
	String name;
	int age;
	String address;

	// 명시적으로 생성자 작성
	// - 접근 제한자 클래스이름(인자){}
	public Student() {
		System.out.println("생성자 호출 됨");
		name="aa";
		age=10;
		address="서울";
	}
}
