
public class TestMain {

	public static void main(String[] args) {
		
//		AbstractClass a = new AbstractClass(); 추상 클래스는 객체 생성 안 됨
		ConcreteClass c = new ConcreteClass(100);
		System.out.println(c.getNum());
		c.test();
		
		AbstractClass ac = new ConcreteClass();
		ac.test();
		
		

	}
}
