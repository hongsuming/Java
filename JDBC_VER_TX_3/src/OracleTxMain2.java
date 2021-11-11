import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTxService;

public class OracleTxMain2 {

	public static void main(String[] args) {
		OracleTxService service = new OracleTxService();

		// TX처리 : insertDelete 호출
		// con.setAutoCommit(false) : 오토커밋 끄기 / con.setAutoCommit(true) : 오토커밋 켜기
		// 추가, 삭제 두 작업을 TX 진행
		service.insertDelete(new Dept(99, "개발", "제주"), 88);
		
		try {
			ArrayList<Dept> list = service.select();
			for (Dept dept : list) {
				System.out.println(dept);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
