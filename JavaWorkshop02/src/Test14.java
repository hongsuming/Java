import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int a = scan.nextInt();
		
		System.out.println("-----곱셈표-----");
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
	}

}
