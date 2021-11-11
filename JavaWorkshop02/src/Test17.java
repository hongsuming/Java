import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {

		System.out.println("오른쪽 위가 직각인 삼각형");
		Scanner scan = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("몇 단 삼각형입니까? : ");
			a = scan.nextInt();
		} while (a<=0);
		
		for(int i=a; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
