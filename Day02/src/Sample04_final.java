
public class Sample04_final {

	public static void main(String[] args) {
		
		// 상수 : 값 변경 불가, 전부 대문자로
		// Byte.MIN_VALUE, Byte.MAX_VALUE
		final int SIZE = 100;
		System.out.println(SIZE);
		
//		SIZE = 200; 값 변경 불가
//		System.out.println(SIZE); 에러 남
		
		int num = 10; 
		System.out.println(num);
		
		num = 20;
		System.out.println(num);

	}

}
