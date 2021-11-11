
public class Ex08_1 {

	public static void main(String[] args) {

		String s = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = "Hello";
		
		System.out.println(s==s2);
		System.out.println(s3==s4);
		
		if(s.equals(s2)) System.out.println("s1과 s2는 같다.");
		if(s3.equals(s4)) System.out.println("s3과 s4는 같다.");
	}
}
