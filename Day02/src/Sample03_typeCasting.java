
public class Sample03_typeCasting {

	public static void main(String[] args) {
		
		byte b = 10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		float b5 = b4; // 정수 -> 실수
		double b6 = b5;
		
		short x = 10;
		short x2 = 20;
		int x3 = x+x2;
//		short x3 = x+x2;
		short x4 = (short)(x+x2); // 연산결과 int30을 명시적으로 작은 타입으로 변환
		
		System.out.println("10"+1+2+3);
		System.out.println(1+2+3+"10");
		
		
		String k = "10";
		System.out.println(k+20);
		int k2 = Integer.parseInt(k); // 문자열을 정수로 변환 후 반환하여 변수에 저장 후 사용
		System.out.println(k2+20);
		
		
		System.out.println(String.valueOf(10)+10); // 정수 10 -> "10"으로 변환! 결과 : 1010
		System.out.println(10+""+10);			   // 결과 : 1010
		
		int p = 100;
		double p2 = 3.14;
		double p3 = p+p2;
	}

}
