
public class EnumTest1 {
	
	public static void check(int num) {
		
		switch(num) {
		case 1: System.out.println("1");break;
		case 2: System.out.println("2");break;
		case 3: System.out.println("3");break;
		default: System.out.println("default");break;
		}

	}

	public static void main(String[] args) {
		check(1);
		check(2);
		check(3);
		check(100);


	}

}
