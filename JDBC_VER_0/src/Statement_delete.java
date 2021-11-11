import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_delete {

	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="scott";
		String passwd ="tiger";

		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 연결 성공");
			con=DriverManager.getConnection(url, userid, passwd);
			stmt = con.createStatement();
			int deptno = 90;
			String sql = "delete from dept where deptno="+deptno;
			System.out.println(sql);
			int num = stmt.executeUpdate(sql);
			System.out.println(num+"개 행이 삭제되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			if(stmt!=null)stmt.close();
			if(con!=null)con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
