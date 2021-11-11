import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		OracleMyBatisService service = new OracleMyBatisService();

		// where 절의 선택적 사용
		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("dname", "개발");
//		map.put("loc", "서울");
		List<Dept> list = service.selectDynamicChoose(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}

	}
}
