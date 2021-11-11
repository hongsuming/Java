import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) throws RecordNotFoundException {
		OracleMyBatisService service = new OracleMyBatisService();


		List<Dept> depts = Arrays.asList(new Dept(12, null, null), new Dept(13, null, null));
		service.multiDelete(depts);
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}

	}
}
