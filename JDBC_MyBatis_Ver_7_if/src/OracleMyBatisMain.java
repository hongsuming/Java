import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		OracleMyBatisService service = new OracleMyBatisService();

		// 부서 번호가 map에 있는 경우는 10번 부서를 찾기
		// 부서번호가 map에 없는 경우는 null인 경우 전체 select하기
		int deptno=10;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("deptno", null);
		List<Dept> list = service.selectDynamicDeptno(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}

	}
}
