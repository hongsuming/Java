import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		String data = "aa/bb/cc,dd/ee/xx,kk/yy/zz";

		StringTokenizer st = new StringTokenizer(data, "/ ,");
		while (st.hasMoreTokens()) {
			// System.out.println(st.nextToken());
			System.out.print(st.nextToken() + " ");
		}
		System.out.println();
		
		String d[] = data.split("/ ,");
		for (String string : d) {
			System.out.println(string);
		}
	}

}
