import java.util.Scanner;

public class IFTest {

	public static void main(String[] args) {
		
		// 1. 단일 if문
		System.out.println("문장1");
		int num = 0;
		if(3==3) { 							// 조건이 true인 경우 블럭 안의 코드 실행
			num = 10;
			System.out.println("문장2");
			System.out.println("문장2-1");
		} 									// 조건이 false인 경우 블럭 밖에서부터 실행
		System.out.println(num);
		System.out.println("문장3");
		
		// 2. 단일 if문
		System.out.println("--------------------------------------------");
		int num2 = 100;
		int result = num2%2;
		String msg = "홀수";
		if(result==0) {
			msg="짝수";
		}
		System.out.println(msg);
		
		// 3. 단일 if문(대소문자 판단)
		System.out.println("---------------------------------------------");
		char c = 'a';
		String msg2 = "대문자";
		if((c>='a')&&(c<='z')) {
			msg2 = "소문자";
		}
		System.out.println(msg2);
		System.out.println("main 종료");
		

	}

}
