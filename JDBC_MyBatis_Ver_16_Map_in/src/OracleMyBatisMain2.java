import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain2 {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("key1", 10);
		map.put("key2", 20);
		List<Dept> list = service.multiSelectMap(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}
