import java.util.HashSet;

import com.service.OracleService;

public class OracleTest {

	public static void main(String[] args) {
		
		OracleService os = new OracleService();
		HashSet<String> xxx = os.select();
		for (String string : xxx) {
			System.out.println(string);
		}

	}

}
