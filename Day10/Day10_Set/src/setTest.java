import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class setTest {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("1");
		set.add("2");
		set.add(3); // 오토박싱 int
		set.add("4");
		set.add(3.15); // 오토박싱 double
		set.add(new Date());
		System.out.println(set);
		
		System.out.println("길이:"+set.size());			// 6개 들어가서 6
		System.out.println("포함여부:"+set.contains(20));	// 20이 포함되어 있냐? false
		System.out.println("empty냐?"+set.isEmpty());	// 비어있냐? false
		
		Object obj [] = set.toArray();	// toArray() : object로 꺼내서 배열에 넣음
		for (Object object : obj) {		
			System.out.println(object);
		}
		set.clear(); // 안에 있는 데이터들 다 없앰
		System.out.println(set); // []

	}

}
