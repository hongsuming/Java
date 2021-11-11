import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("한 자리 정수값을 입력하세요.");
			a = scan.nextInt();
		} while (a>=10);
		
		int sum=0;
		for(int i=a; i<=100; i++) {
			if((i%a)==0) { // 5의 배수
				sum+=i;	   // 5의 배수의 합 누적
				if(i!=a) System.out.print("+");
				System.out.print(i);
			}
		}
		System.out.print("="+sum);

	}
}
