import java.io.IOException;

class A{
	public void a() throws ArithmeticException{}
	public void b() throws ArithmeticException, NullPointerException{}
	public void c() throws IOException{}
	
}

class B extends A{
//	public void a() throws Exception{}
	public void b() throws ClassCastException{}
}

public class ExceptionTest_throws3 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		System.out.println("프로그램 종료");
		
	}
}
