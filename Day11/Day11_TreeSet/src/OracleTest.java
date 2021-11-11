import java.util.Set;

import com.service.OracleService;

public class OracleTest {

	public static void main(String[] args) {
		
		OracleService os = new OracleService();
		Set<String> xxx = os.select();
		for (String string : xxx) {
			System.out.println(string);
		}

	}

}
