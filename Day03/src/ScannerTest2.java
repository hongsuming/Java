import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		
		// scanner 이용해서 이름 입력 받기
		// 이름이 "홍길동"인 경우 동일함, "이름이 다름"
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		
		boolean result = name.equals("홍길동");
		String sam = (result)?"동일함":"이름이 다름";
		
		System.out.println("입력하신 이름은 "+name+"입니다."+sam);

	}

}
