class UserException extends Exception{
	public UserException(String mesg) {
		super(mesg);
	}
}

public class ExceptionTest_Userthrow {
	
	public static void check(int num) throws UserException{
		if(num<100) {
			throw new UserException("num 값이 100보다 작다.");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		try {
			check(70);
		} catch (UserException e) {
			System.out.println("main try~catch :"+e.getMessage());
		} 
		
		System.out.println("프로그램 종료");
		
	}
}
