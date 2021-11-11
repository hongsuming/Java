
public class ExceptionTest_throws {
	
	public static void a() throws ArithmeticException{
		b();
	}
	public static void b() throws ArithmeticException{
		int num=10;
		int result=num/0;
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		try {
			a();
		} catch (ArithmeticException e) {
			System.out.println("main try~catch :"+e.getMessage());
		}
		
		System.out.println("프로그램 종료");
		
	}
}
