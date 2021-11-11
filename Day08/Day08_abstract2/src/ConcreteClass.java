
public class ConcreteClass extends AbstractClass{

	public ConcreteClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcreteClass(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void a() {
		System.out.println("A");
	}

	@Override
	public int b() {
		System.out.println("B");
		return 0;
	}

	@Override
	public void c(int x) {
		System.out.println("C");
	}

}
