import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2자리의 정수를 입력하세요.");
		int a;
		do {
			System.out.print("입력 : ");
			a = scan.nextInt();
		} while (a<10||a>=100);
		
		System.out.println("입력 값은 "+a);

	}

}
