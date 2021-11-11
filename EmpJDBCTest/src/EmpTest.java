import java.util.ArrayList;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpTest {

	public static void main(String[] args) {
		
		EmpBiz empBiz = new EmpBiz();
		
//		empBiz.empIsert(new EmpDTO(30, "Kim", "sales", 7902, null, 0.0, 0.1, 10));
		
//		empBiz.empUpdate(new EmpDTO(3, "kim", "sales", 7902, null, 0.0, 0.1, 10));
		
		try {
			empBiz.empDelete("98");
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		
		
//		System.out.println(empBiz.selectDetailEmp("30"));
		
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("job", "SALES");
//		map.put("deptno", "10");
//		empBiz.selectDetailEmp2(map);
		
//		ArrayList<EmpDTO> list = empBiz.selectAllemp();
//		for (EmpDTO empDTO : list) {
//			System.out.println(empDTO);
//		}

	}
}
