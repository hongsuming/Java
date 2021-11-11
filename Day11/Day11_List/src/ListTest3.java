import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("강감찬");
		list.add("세종");
		
		System.out.println("길이(크기):"+list.size());
		System.out.println("값 포함 여부:"+list.contains("세종"));
		System.out.println("특정 값 위치:"+list.indexOf("세종"));
		System.out.println("값이 없나?"+list.isEmpty());
		
		System.out.println(list);
		List<String> sub = list.subList(0, 3);
		for (String string : sub) {
			System.out.println(">>>"+string);
		}
		
		Object obj[] = list.toArray();
		for (Object object : obj) {
			System.out.println("object:"+object);
		}
		
		list.add(0, "정조");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);

	}
}
