import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 정수 입력하세요.");
//		int a = scan.nextInt();
		String a2 = scan.next();
		int a = Integer.parseInt(a2);
		
		System.out.println("2. 정수 입력하세요.");
//		int b = scan. nextInt();
		String b2 = scan.next();
		int b = Integer.parseInt(b2);
		
		int ab = a+b;
		System.out.println("정수 "+ a+"와(과) "+"정수 "+b+"의 합계 : "+ab);

	}

}
