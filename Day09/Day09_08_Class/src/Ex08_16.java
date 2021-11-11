import java.util.StringTokenizer;

public class Ex08_16 {

	public static void main(String[] args) {
		
		String names = "홍길동, 이순신, 유관순";
		
		StringTokenizer st = new StringTokenizer(names, ",");
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
