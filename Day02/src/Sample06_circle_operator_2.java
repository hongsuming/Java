
public class Sample06_circle_operator_2 {

	public static void main(String[] args) {
	
		String name = null;
		System.out.println((4>2) || (name.length()==4)); // 4>2가 참이라 뒤에 조건은 실행 안 함
		System.out.println((4<2) || (name.length()==4)); // 4>2가 거짓이라 뒤에 조건은 실행해서 널포인터익셉션
	}

}
