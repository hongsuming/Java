import java.util.HashMap;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("one", "홍길동");
		map.put("two", "이순신");
		map.put("three", "유관순");
		
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		
		System.out.println(map);
		
		System.out.println("크기:"+map.size());
		System.out.println("키 포함 여부:"+map.containsKey("one"));
		System.out.println("값 포함 여부:"+map.containsValue("유관순"));
		
		map.replace("three", "강감찬");
		map.remove("two");
		System.out.println(map);


	}
}
