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


		List<Integer> deptnoes2 = Arrays.asList(12, 13, 50);
		service.multiUpdate(deptnoes2);

		List<Integer> deptnoes = Arrays.asList(12, 13, 50);
		List<Dept> list = service.multiSelect(deptnoes);
		for (Dept dept : list) {
			System.out.println(dept);
		}

	}
}
