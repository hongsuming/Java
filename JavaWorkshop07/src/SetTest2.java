import java.util.HashSet;

public class SetTest2 {

	public static void main(String[] args) {
		
		String str = args[0];
		
		
		
		char chars[] = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0; i<chars.length; i++) {
			set.add(chars[i]);
		}
		
		System.out.println(set);

	}
}
