import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest5 {

	public static void main(String[] args) {
		
		HashMap<String,Person> map = new HashMap<>();
		map.put("one", new Person("홍길동", 20, "서울"));
		map.put("two", new Person("이순신", 30, "전라"));
		map.put("three", new Person("유관순", 40, "충주"));
		
		System.out.println(map.get("one").getName());
		Person p1 = map.get("one");
		System.out.println(p1.getName());
		
		// foreach 이용
		Set<String> keyString = map.keySet();
		for (String string : keyString) {
			System.out.println("foreach:"+map.get(string).getName());
		}
		
		// iterator 이용
		Iterator<String> it = keyString.iterator();
		while(it.hasNext()) {
			System.out.println("iterator:"+map.get(it.next()).getName());
		}


	}
}
