import java.util.Properties;

public class MapTest8 {

	public static void main(String[] args) {

		Properties pro = new Properties();
		pro.setProperty("one", "홍길동");
		pro.setProperty("two", "홍길동2");
		pro.setProperty("three", "홍길동3");
		
		
		String one = pro.getProperty("one");
		System.out.println(one);
		System.out.println(pro.getProperty("two"));
		System.out.println(pro.getProperty("three"));

	}
}
