import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주소를 입력하시오.");
		String address = scan.nextLine();
		System.out.println("문자 갯수(공백포함) : "+ address.length());
		System.out.println("단어 갯수 : "+address.split(" ").length);
		
		
		

	}

}
