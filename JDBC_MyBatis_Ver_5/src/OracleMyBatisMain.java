import java.util.HashMap;
import java.util.Set;

import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		OracleMyBatisService service = new OracleMyBatisService();

		HashMap map = service.selectByDeptnoHashMap(10);
		System.out.println(map);
		Set keys = map.keySet();
		for (Object key : keys) {
			System.out.println(key+ ":" +map.get(key));
		}

	}
}
