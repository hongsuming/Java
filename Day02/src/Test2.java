
public class Test2 {

	public static void main(String[] args) {
		
		// java 문자열 내용 비교할 때 == 사용 불가
		String m = "hello";
		String m2 = "hello";
		System.out.println(m==m2);
		System.out.println(m.equals(m2)); // equals 메소드를 사용해야 됨
		
		System.out.println(m.hashCode());
		System.out.println(m2.hashCode());
		

	}

}
