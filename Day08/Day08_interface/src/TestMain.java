
public class TestMain {

	public static void main(String[] args) {
		
		ConcreteClass c = new ConcreteClass();
		c.a();
		c.b();
		c.c();
		A.d();
		System.out.println(A.NUM);
		System.out.println(c.NUM);
		
		A a = new ConcreteClass();
		a.a();

	}

}
