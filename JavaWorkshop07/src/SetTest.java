import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		
		String st = "JavaProgramming";
		
		char chars[] = st.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0; i<chars.length; i++) {
			set.add(chars[i]);
		}
		
		System.out.println(set);

	}
}
