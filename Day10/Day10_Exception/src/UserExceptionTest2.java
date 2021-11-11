import java.util.Random;

public class UserExceptionTest2 {

	public static void myRandom() throws UserException{
		Random r = new Random();
		int num = r.nextInt(3);
		System.out.println("random = "+num);
		
		if(num==0) {
			throw new UserException("랜덤값 0이 나와 예외발생");
		}
	}

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			myRandom();
		} catch (UserException e) {
			System.out.println("main :"+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}

}
