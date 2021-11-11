import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTxService;

public class OracleTxMain {

	public static void main(String[] args) {
		OracleTxService service = new OracleTxService();
		// 드라이버 로딩, 4가지 정보 이용해서 컨넥션을 연결
		
//		service.delete(99);
		
//		int deptno = 99;
//		String dname = "개발";
//		String loc = "제주";
//		Dept xx = new Dept(deptno, dname, loc);
//		service.insert(xx);
//		service.insert(new Dept(99, "개발", "제주"));
		
		try {
			service.update(new Dept(0, "경제", "서울"));
		}catch (RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			ArrayList<Dept> list = service.select();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
