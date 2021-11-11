import java.util.ArrayList;

import com.dto.Dept;
import com.service.OracleService;

public class OracleMain {
	public static void main(String[] args) {
		OracleService service = new OracleService();
		
//		Dept d = new Dept(99, "영업", "서울");
//		service.insert(d);
		
		try {
			service.update(new Dept(99, "영업", "천호"));
		} catch (ReflectiveOperationException e1) {
			e1.printStackTrace();
		}
		
		
		try {
			ArrayList<Dept> list = service.select();
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		int num = service.delete(99);
//		System.out.println(num+"개 행이 삭제 되었습니다.");
		
		
		
		
		
	}
}
