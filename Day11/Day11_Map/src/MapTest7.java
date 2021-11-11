import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest7 {

	public static void main(String[] args) {

		HashMap<String, Person> map = new HashMap<String, Person>();
		map.put("one", new Person("홍길동", 20, "서울"));
		map.put("two", new Person("홍길동2", 30, "서울2"));
		map.put("three", new Person("홍길동3", 40, "서울3"));
		HashMap<String, Person> map2 = new HashMap<String, Person>();
		map2.put("one", new Person("이순신", 20, "전라"));
		map2.put("two", new Person("이순신2", 30, "전라2"));
		map2.put("three", new Person("이순신3", 40, "전라3"));

		ArrayList<HashMap<String, Person>> list = new ArrayList<HashMap<String, Person>>();
		list.add(map);
		list.add(map2);

		for (HashMap<String, Person> h : list) {
			Set<String> keys = h.keySet();
			for (String key : keys) {
				Person p = h.get(key);
				System.out.println(p.getName() + "\t" + p.getAge() + "\t" + p.getAddress());
			}
		}
		System.out.println("-------------------------------------------");
		
		Iterator<HashMap<String, Person>> it = list.iterator();
		while(it.hasNext()) {
			HashMap<String, Person> m = it.next();
			Set<String> keys = m.keySet();
			Iterator<String> key = keys.iterator();
			for (String s : keys) {
				Person p = m.get(s);
				System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getAddress());
			}
		}

	}
}
