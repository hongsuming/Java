
public class Sample07_3operator {

	public static void main(String[] args) {
		
		// 3항 연산자로 최대 값 구하기
		int a = 10;
		int b = 20;
		int c = 30;
		
		int max = (a>b) ? a:b;		// max = b
		max = (max>c) ? max:c;		// max = c
		System.out.println(max);	// 30
		
		int max2 = (a>b)?((a>c)?a:c):((b>c)?b:c);
		// 1. a>b 비교 a가 크면 a>c, b가 크면 b>c
		// 2. a>c에서 a가 크면 a, a가 작으면 c
		// 3. b>c에서 b가 크면 b, b가 작으면 c
		System.out.println(max2);

	}

}
