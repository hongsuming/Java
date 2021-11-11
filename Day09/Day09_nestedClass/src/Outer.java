
public class Outer {
	
	public int n = 10;
	protected int n2 = 20;
	int n3 = 30;
	private int n4 = 40;
	static int n5 = 50;
	
	public void x() {}
	
	class Inner{
		int k = 10;
		static final int NUM = 20;
		public void info() {
			System.out.println(n);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);
			System.out.println(n5);
			System.out.println(k);
			System.out.println(NUM);
		}
	}
	
	public void innerCreate() {
		Inner inner = new Inner();
		inner.info();
	}

}
