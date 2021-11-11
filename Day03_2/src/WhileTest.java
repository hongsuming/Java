
public class WhileTest {

	public static void main(String[] args) {
		
		// while문
		
		int n = 0;	// 초기값
		while(n<5) {// 조건식 검사
			System.out.println("while문 안---------- "+n);
			n++;	// 0에서 1로 증가
		}
		System.out.println("while문 바깥 ------------"+n);
		
		// do while문
		
		int n2 = 0;
		do {
			System.out.println("world" + n2);
			n2++;
		}while(n2<5);
		System.out.println("do~while 바깥 "+ n2);
		


	}

}
