import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		
		System.out.println("오른쪽 아래가 직각인 삼각형");
		Scanner scan = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("몇 단 삼각형입니까? : ");
			a = scan.nextInt();
		} while (a<=0);
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
