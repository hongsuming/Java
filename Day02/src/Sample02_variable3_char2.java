
public class Sample02_variable3_char2 {

	public static void main(String[] args) {

		// char은 수치형이다.
		char c = 'A'; // 65
		char c1 = 'a'; // 97
		System.out.println(c+1); // 66
		System.out.println(c1+1); // 98
		
		char c3 = (char)(c+1); // 명시적 형 변환
		System.out.println(c3);
		char c2 = (char)65;
		System.out.println(c2);
	}

}
