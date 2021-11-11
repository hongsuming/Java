import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("보너스 및 월급 구하기");
		System.out.print("근무시간 입력 : ");
		int a = scan.nextInt(); // 근무시간
		System.out.print("월급 입력 : ");
		int b = scan.nextInt(); // 월급
		
		int bonus=0;
		if(a>=25) {
			bonus+=(b*1);
		} else if(a>=20) {
			bonus+=(b*0.8);
		} else if(a>=18) {
			bonus+=(b*0.5);
		} else if(a<18) {
			bonus=0;
		}
		
		int sal=b+bonus;
		
		System.out.println("------------------");
		System.out.println("보너스 : "+bonus);
		System.out.println("지급될 급여 : "+sal);
		

	}

}
