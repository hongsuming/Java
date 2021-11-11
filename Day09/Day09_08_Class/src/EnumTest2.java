
public class EnumTest2 {
	
	public static final int SELECT=1;
	public static final int INSERT=2;
	public static final int DELETE=3;
	
	public static void check(int num) {
		
		switch(num) {
		case SELECT: System.out.println("1");break;
		case INSERT: System.out.println("2");break;
		case DELETE: System.out.println("3");break;
		default: System.out.println("default");break;
		}

	}

	public static void main(String[] args) {
		check(SELECT);
		check(INSERT);
		check(DELETE);
		check(100);


	}

}
