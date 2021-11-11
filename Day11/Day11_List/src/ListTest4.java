import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		System.out.println(list);
		
		List<String> list2 = Arrays.asList("홍길동", "이순신", "세종", "세종"); // 문자열 데이터 지정하여 바로 list 생성
		System.out.println(list2);

	}
}
