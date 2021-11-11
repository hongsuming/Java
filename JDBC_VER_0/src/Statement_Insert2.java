import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_Insert2 {

	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="scott";
		String passwd ="tiger";

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("db 연결 완료");
			con = DriverManager.getConnection(url, userid, passwd);
			stmt = con.createStatement();
			
			String sql = "insert into dept"+" values(13, '개발', '서울')";
			int num = stmt.executeUpdate(sql);
			
			int deptno = 14;
			String sql2 = "insert into dept"+" values("+deptno+", '개발', '서울')";
			int num2 = stmt.executeUpdate(sql2);
			
			System.out.println("실행된 레코드 갯수:"+(num+num2));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
	}
}
