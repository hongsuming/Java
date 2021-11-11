import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		OracleMyBatisService service = new OracleMyBatisService();

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("key1", 10);
		map.put("key2", 30);
		List<Dept> list = service.selectByHashMap(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}

	}
}
