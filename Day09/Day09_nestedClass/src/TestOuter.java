
public class TestOuter {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.innerCreate();
		
		Outer outer2 = new Outer();
		Outer.Inner inner = outer2.new Inner();
		inner.info();

	}

}
