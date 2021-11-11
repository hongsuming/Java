import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setTest4 {
	
	public static void change3(HashSet<String> set) {
		set.remove("홍길동");
	}
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		System.out.println("변경 전:"+set);
		change3(set);
		System.out.println("변경 후:"+set);
		
	}
}
