import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class MapTest9 {

	public static void main(String[] args) {

		Properties pro = System.getProperties(); // 이클립스에서 사용하고 있는 환경변수들을 key:value로 가져와서
												 // properties 객체에 담아줌
		
		Enumeration<?> e = pro.propertyNames();
		while(e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = pro.getProperty(key);
			System.out.println(key+"="+value);
		}
		
		System.out.println("======================");
		Set<String> keys = pro.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key+"="+pro.getProperty(key));
		}
		

	}
}
