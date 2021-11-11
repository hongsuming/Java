import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 정수를 입력하세요.");
		int a = scan.nextInt();
		System.out.println("2. 정수를 입력하세요.");
		int b = scan.nextInt();
		System.out.println("3. 정수를 입력하세요.");
		int c = scan.nextInt();
		
		int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("정수 "+a+"과 정수 "+b+", 정수 "+c+" 중에서 최대값 : "+max);

	}

}
