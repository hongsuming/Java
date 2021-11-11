import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		
		// scanner 이용한 while문
		
		int n=0;
		Scanner scan = new Scanner(System.in);
		String name = "";
		while(true) {// 조건식 검사 - 무한반복
			System.out.println("이름을 입력하세요.");
			name = scan.next();
			if(name.equals("홍길동")||(n==5)) break;
			n++;
		}
		System.out.println("while문 바깥 ------------"+name);
		

	}

}
