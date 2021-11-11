import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("양의 정수값의 자릿수 구하기");
		
		int a;
		do { // 정수값 받는 반복문
			System.out.println("정수값 : ");
			a = scan.nextInt();
		} while (a<=0); // 받은 정수값이 0보다 작거나 같으면 반복
						// 0보다 크면 반복문 빠져나감
		
		String strdata = a+""; // length() 함수를 사용하기 위해서 문자열로 변환
		int count = 0;
		while(a>0) {
			a/=10; // a를 10으로 나눠서 자릿수를 구함
			count++;
		}
		System.out.println("그 수는 "+count+"입니다.");
		System.out.println("그 수는 "+strdata.length()+"입니다.");
		

	}

}
