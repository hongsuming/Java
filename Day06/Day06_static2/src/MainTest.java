class Counter{
	
	private int num; // 멤버 변수 : 객체 생성, new 객체마다 따로 생성, 참조변수.멤버변수
	private static int count; // static 변수 : 객체 생성x, 1번만 자동 생성됨(기본값으로 초기화), 클래스명.static변수
	
	// 생성자
	public Counter() {
		num++;
		count++;
	}
	
	// get, set 함수
	public int getNum() {
		return this.num;
	}
	public int getCount() { // 멤버 함수 : 클래스 객체 생성 하여야 사용 가능함
		return count; // static 변수에는 this 키워드를 사용 안 함
	}
	
	// static get, set 함수
	public static int getCount2() { // static 함수 : 객체 생성 없이 사용, 클래스명.static함수명
		int aa=10;	
//		System.out.println(num);	   static 함수 안에선 멤버변수 사용 불가능
		return count;				// static 변수 리턴
	}
	public static void setCount2(int a) {
		count=a;
	}
	
}
public class MainTest {

	public static void main(String[] args) {
		
		System.out.println(Counter.getCount2()); // static 함수 호출, 객체 생성x, 클래스명.static함수명
		Counter c1 = new Counter();
		System.out.println("getCount() = "+c1.getCount()+", getNum() = "+c1.getNum());
		Counter c2 = new Counter();
		System.out.println("getCount() = "+c2.getCount()+", getNum() = "+c2.getNum());
		c1.setCount2(100);
		System.out.println(c2.getCount2());

	}

}
