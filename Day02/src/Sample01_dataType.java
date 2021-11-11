import java.util.Date;

public class Sample01_dataType {

	public static void main(String[] args) {
		// 기본형 데이터
		System.out.println(100);	// 정수, 기본 - int
		System.out.println(100L);	// 정수, L - long
									// long 타입은 숫자 뒤에 L을 명시해야 됨
		System.out.println("100");	// 문자열 100
		
		System.out.println(3.14);   // 실수, 기본 - double
		System.out.println(3.14f);  // 실수, f - float
									// float 타입은 숫자 뒤에 f를 명시해야 됨
		System.out.println(3.14D);  // 실수, double
		System.out.println('홍');	// 문자(한 자) 반드시 ''
		
		System.out.println(true);	// 논리 값(true, false)
		System.out.println(false);	// 논리 값(true, false)
									// boolean은 대문자 안 됨! 소문자로 입력!
//		System.out.println(null);	// null은 출력할 수 없음
		
		// 참조형 데이터
		System.out.println("홍");	// 문자열(string) 반드시 ""
									// "홍"이라는 문자열을 저장하는 객체
		System.out.println(new Date());	// 날짜 관리하는 Date Util Class객체

	}

}
