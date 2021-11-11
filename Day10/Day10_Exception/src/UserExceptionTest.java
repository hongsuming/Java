
public class UserExceptionTest {
	public static void a() throws UserException{
		b();
	}
	public static void b() throws UserException{
		try {
			int num=10;
			int result=num/0;
			System.out.println(result);
		}catch(ArithmeticException e){
			throw new UserException("0으로 나누어 예외발생");
		}
	}

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			a();
		} catch (UserException e) {
			System.out.println("main :"+e.getMessage());
		}
		System.out.println("프로그램 종료");

	}

}
