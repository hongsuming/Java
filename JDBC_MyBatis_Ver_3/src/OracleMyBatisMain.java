import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		OracleMyBatisService service = new OracleMyBatisService();

//		service.insert(new Dept(99, "개발", "강남"));
//		service.update(new Dept(99, "개발", "서울"));
//		System.out.println(service.selectByDeptno(99));
//		service.delete(99);
		
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}

	}
}
