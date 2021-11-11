import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest4_keySet {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("one", "홍길동");
		map.put("two", "이순신");
		map.put("three", "유관순");
		
		map.replace("three", "강감찬");
		map.remove("two");
		
		
		Set<String> keys = map.keySet(); // key 값만 얻어서 Set형의 keys 변수에 넣음
		System.out.println("Set에 넣은 키 값 꺼내기:"+keys);
		
		// foreach로 키 값 출력
		for (String string : keys) {
			System.out.println(string+"\t"+map.get(string));
		}
		
		// Iterator로 키 값 출력
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) { 
			String key=it.next();
			System.out.println(key+"\t"+map.get(key));
		}

	}
}
