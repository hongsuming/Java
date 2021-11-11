
public class MainTest {
	// static 초기화 블럭 : 특정 작업의 초기화 -> 드라이버 로딩 등
	static {
		System.out.println("static 초기화블럭");
	}
	// 인스턴스 초기화 블럭 : 객체 초기화시 사용 (사용하는 경우 거의 없음 = 생성자 사용하면 됨)
	{
		System.out.println("인스턴스 초기화 블럭 - 생성자 호출 전");
	}
	public MainTest() {
		System.out.println("MainTest 생성자");
	}

	public static void main(String[] args) {
		MainTest m = new MainTest();
		MainTest m2 = new MainTest();
		MainTest m3 = new MainTest();
		

	}

}
