
public class TestMethod {
	// 멤버변수, 메소드, 생성자 작성 가능
	
	String name;
	
	// 멤버 함수
	// 문법 : 접근제한자 리턴타입 함수명(매개변수){}
	public void test() { // 매개변수로 받는 것도 없고 함수 처리 후 반환(리턴)값도 없음
		System.out.println("test() 호출됨    "+name);
	}
	
	// int num을 매개변수로 받음
	public static void numA(int num) {
		System.out.println("numA 호출============"+num);
		num=100;
	}
	
	public static int numB() {
		System.out.println("numB 호출============");
		int num=100;
		return num;
	}
	
	public static int numC(int num) {
		System.out.print("numC 호출 = ");
		return num+100;
	}
	
	public static String numC(String num) {
		System.out.print("numC 오버로딩1 호출 =");
		return num+100;
	}
	
	public static String numC(String num1, int num2) {
		System.out.print("numC 오버로딩2 호출 = ");
		return num1+num2;
	}
	
	
	
	
	

	public static void main(String[] args) { // static => 객체 생성 없이 함수 호출 가능 / void => return 값 없음
		
		TestMethod t = new TestMethod();
		t.name="홍수민";
//		t.test();
		TestMethod t2 = new TestMethod();
		t2.name="김진석";
		
		int num=1;
//		numA(num);
//		System.out.println(num);
		
//		System.out.println(numB());
		
		System.out.println(numC(100));
		System.out.println(numC("홍수민"));
		System.out.println(numC("21",23));
		
		
	}

}
