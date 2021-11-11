
public class ConcreteClass2 extends AbstractClass{
	public ConcreteClass2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcreteClass2(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void a() {
		System.out.println("A");
	}

	// 내용이 없더라도 구현해줘야 에러 안 남
	@Override
	public int b() {
		return 0;
	}

	@Override
	public void c(int x) {
	}

}
