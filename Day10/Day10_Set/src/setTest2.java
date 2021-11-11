import java.util.HashSet;
import java.util.Iterator;

public class setTest2 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		set.add("6");
//		set.add(10); 잘못된 데이터 형을 저장하면 컴파일 에러
		
		
		// 안에 있는 데이터들을 꺼내올 때 방법
		// 1. toString()
		System.out.println(set);
		
		// 2. foreach문
		for (String string : set) {
			System.out.println(string);
		}

		// 3. iterator 이용
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String m = it.next();
			System.out.println(">>"+m);
		}
	}
}
