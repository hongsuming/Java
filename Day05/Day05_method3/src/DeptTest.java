
public class DeptTest {

	public static void main(String[] args) {

		Dept d1 = new Dept(1, "회계부", "강남");
		String data = d1.getData();

		System.out.println(d1);
		System.out.println(data);
		d1.printData();
	}

}
