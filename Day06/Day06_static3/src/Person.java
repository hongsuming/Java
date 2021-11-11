
public class Person {
	
	static {
		System.out.println("static block");
	}
	
	String name; 	// 멤버변수
	static int age; // static 변수
	
	public void a() { // 멤버함수
		System.out.println("in a() - "+this.name);
		System.out.println("in a() - "+age);
	}
	
	public static void b() { // static 함수
		System.out.println("static void b() - ");
		System.out.println(age);
	}

}
