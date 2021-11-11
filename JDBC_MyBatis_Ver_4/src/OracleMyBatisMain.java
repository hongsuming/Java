import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		OracleMyBatisService service = new OracleMyBatisService();


//		service.insert(new Dept(99, "aa", "aa"));
		
//		List<Dept> list = service.selectAll();
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}

		int num = service.deptRecordCount();
		System.out.println("전체 레코드 개수는 "+num);
	}
}
