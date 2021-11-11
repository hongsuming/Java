
public class TestMain {

	public static void main(String[] args) {
		

		ConcreteClass c = new ConcreteClass(100);
		System.out.println(c.getNum());
		c.a();
		int n = c.b();
		c.c(100);
		
		ConcreteClass c2 = new ConcreteClass();
		System.out.println(c2.getNum());
		c2.a();
		int n2 = c2.b();
		c2.c(100);
		
		ConcreteClass2 c3 = new ConcreteClass2();
		System.out.println(c2.getNum());
		c3.a();
		int n3 = c3.b();
		c3.c(100);
		
		

	}
}
