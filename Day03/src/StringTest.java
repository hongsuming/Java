
public class StringTest {

	public static void main(String[] args) {
		
		// 1. 객체 생성해서 주소 담는 변수 s,s2
		String s = new String("hello");
		String s2 = new String("hello");
		System.out.println(s==s2);			// false
		boolean result = s.equals(s2);
		System.out.println(result);			// true
		
		// 2. 문자열 담는 변수 n, n2
		String n = "hello";
		String n2 = "hello";
		System.out.println(n==n2);			// true
		boolean result2 = n.equals(n2);
		System.out.println(result2);		// true

	}

}
