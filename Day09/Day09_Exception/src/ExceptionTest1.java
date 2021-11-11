
public class ExceptionTest1 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		try {
			int num = 10;
			int result = num/0; 
			String name = null;
			name.length();
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("예외발생");
		}
		
		System.out.println("프로그램 종료");

	}

}
