
public class Ex08_2 {

	public static void main(String[] args) {
		
		String s = "abcde";
		String s2 = "Hello";
		String s3 = "홍길동/이순신/유관순";
		System.out.println("문자열 길이 :"+s.length());
		System.out.println("문자열 비교 :"+s2.equals("Hello"));
		System.out.println("문자열 비교 :"+s2.equalsIgnoreCase("HELLO"));
		System.out.println("부분열 출력 :"+s.substring(2, 4));
		System.out.println("문자 바꿈 : "+s.replace('a', 'c'));
		System.out.println("소문자로 바꿈 :"+s.toLowerCase());
		System.out.println("대문자로 바꿈 :"+s.toUpperCase());
		System.out.println("인덱스 값의 문자 출력 : "+s.charAt(3));
		System.out.println("공백제거 : "+s2.trim());
		System.out.println("문자열 연결 : "+s.concat("test"));
		System.out.println("a에 맞는 인덱스 값 출력 : "+s.indexOf("a"));
		System.out.println("x에 맞는 인덱스 값 출력 : "+s.indexOf("x"));
		System.out.println("시작하는 문자열 비교 : "+s.startsWith("abc"));
		System.out.println("끝나는 문자열 비교 : "+s.endsWith("cde"));
		
		String names[] = s3.split("/");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("123 문자열로 변환 : "+String.valueOf(123));
		System.out.println("3.14 문자열로 변환 : "+String.valueOf(3.14));
		System.out.println("true 문자열로 변환 : "+String.valueOf(true));
		String formatString = String.format("이름은 %s, 나이는 %d, 키는 %.2f" , "홍길동", 20, 180.2);
		System.out.println(formatString);
		System.out.println(s);
	}

}
