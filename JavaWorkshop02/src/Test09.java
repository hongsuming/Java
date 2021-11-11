import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		
		System.out.println("세 정수의 최대값, 최소값 구하기");
		System.out.println("a 값 :");
		int a = scan.nextInt();
		System.out.println("b 값 :");
		int b = scan.nextInt();
		System.out.println("c 값 :");
		int c = scan.nextInt();
		
		// 내가 푼 방법
//		if(a>b&&a>c) max=a;
//		if(b>a&&b>c) max=b;
//		if(c>a&&c>b) max=c;
//		if(a<b&&a<c) min=a;
//		if(b<a&&b<c) min=b;
//		if(c<a&&c<b) min=c;
		
		// 선생님 방법
		max=a;
		if(b>max)max=b;
		if(c>max)max=c;
		min=a;
		if(b<min)min=b;
		if(c<min)min=c;
		
		System.out.println("최대값 : "+max+", 최소값: "+min);

	}

}
