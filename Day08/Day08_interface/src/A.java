
public interface A { // 주의!! 클래스 아님 인터페이스임!
// new 객체 생성 안 됨, 다른 클래스가 implements A로 추상 함수를 강제 구현해야 됨
	
	int NUM=10; // public static final 자동으로 지정 됨. A.NUM으로 사용
	public abstract void a(); // 추상 함수 abstract 명시적 기재
	void b(); 				  // public abstract 자동으로 지정됨. 추상 함수
	
	public default void c() { // 기본 사용 함수 내용 구현
		System.out.println("c");
	}
	public static void d() {  // 객체 생성 없이 사용 가능 A.d로 사용 가능
		System.out.println("d");
	}
	
//	public void e() {} 일반 메소드 불가

}
