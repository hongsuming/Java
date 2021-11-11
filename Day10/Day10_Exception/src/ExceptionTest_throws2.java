
public class ExceptionTest_throws2 {
	
	public static void a() throws ArithmeticException, NullPointerException{
		b();
	}
	public static void b() throws ArithmeticException, NullPointerException{
		int num=10;
		int result=num/0;
		System.out.println(result);
		
		String name=null;
		System.out.println(name.length());
	}

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		try {
			a();
//		} catch (ArithmeticException e) {
//			System.out.println("main try~catch :"+e.getMessage());
//		} catch (NullPointerException e) {
//			System.out.println("main try~chath :"+e.getMessage());
//		}
		} catch (Exception e) {
			System.out.println("main try~catch :"+e.getMessage());
		}
		
		System.out.println("프로그램 종료");
		
	}
}
