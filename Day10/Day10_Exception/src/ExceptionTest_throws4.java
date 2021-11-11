
public class ExceptionTest_throws4 {
	
	public static void a(){
		b();
	}
	public static void b(){
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
