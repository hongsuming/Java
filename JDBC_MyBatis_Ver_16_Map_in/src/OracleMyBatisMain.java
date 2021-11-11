import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {
		OracleMyBatisService service = new OracleMyBatisService();
		
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		System.out.println("----------------------------");
		List<Dept> list2 = service.selectAll2();
		for (Dept dept : list2) {
			System.out.println(dept);
		}
	}

}
