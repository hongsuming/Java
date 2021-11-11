
public class TestPet3 {
	public static void main(String[] args) {
		
		Object objects[] = {
					10,	// 오토박싱 10 -> new Integer(10)으로 자동으로 변환하여 배열에 넣어줌
					"홍길동",
					new Cat("야옹이", 3, "암놈"),
					new Cat("흰둥이", 3, "숫놈"),
					new Dog("누렁이", 8, "암놈", "누런색")
		};
		
		Object x = 10;
		x = "홍길동";
		x = 3.3123;// 오토박싱 new Double(3.3123)
		x = true;  // 오토박싱 new Boolean(true)
		x = new Cat("진석", 23, "숫놈");

		System.out.println("10".equals("10"));
		System.out.println(x.equals(x));
		
		Cat x2 = new Cat("진석", 23, "숫놈");
		System.out.println(x==x2);
		System.out.println(x.equals(x2)); // equals 함수 객체의 멤버 변수 비교하도록 overriding 한 후 사용해야 됨
	}
}
