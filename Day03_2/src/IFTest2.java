
public class IFTest2 {

	public static void main(String[] args) {
		
		// 1. if~else문
		// num2 = 100 홀, 짝 판단하는 문장 완성
		int num2 = 100;
		String msg="";
		if(num2%2==0) {
			msg = "짝수입니다.";
		} else {
			msg = "홀수입니다.";
		}
		System.out.println("숫자 "+num2+"는 "+msg+"입니다.");
		
		// 2. if~else문
		System.out.println("문장1");
		int num = 0; // 변수 선언
		if (3==3) {
			num = 3; // 변수 값 설정
			System.out.println("참");
			System.out.println("참2");
			System.out.println(num);
		} else {
			num = 10;
			String name = "aaaa"; // else 블럭에서만 사용 가능한 변수
			System.out.println("거짓");
			System.out.println("거짓2");
			System.out.println(num);
		}
		System.out.println("if ~ else 문 바깥 ------ "+num);
		System.out.println("문장3");
		
		char c= 'a';
		String msg2="";
		if(c>='a'&&c<='z') {
			msg2 = "소문자";
		}else {
			msg2 = "대문자";
		}
		System.out.println(msg2);
		System.out.println("main 종료");

	}

}
