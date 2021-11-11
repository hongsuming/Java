import com.dao.MySQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;

public class DBMain {

	public static void main(String[] args) {
		
//		DBService service = new DBService();
//		service.setDAO(new OracleDAO());
		
		DBService service = new DBService();
		service.setDAO(new MySQLDAO());

	}

}
