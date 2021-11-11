import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ListTest2 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("강감찬");
		list.add("세종");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		for (Object object : list) {
			System.out.println("foreach:"+object);
		}
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("iterator:"+it.next());
		}

	}

}
