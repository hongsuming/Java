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
		
//		List<Dept> deptList = service.selectTopN(0,4);
//		for (Dept dept : deptList) {
//			System.out.println(dept);
//		}
		
		String date = service.getDate();
		System.out.println(date);
	}
}
