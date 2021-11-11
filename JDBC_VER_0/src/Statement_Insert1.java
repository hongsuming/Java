import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_Insert1 {

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
			
			int deptno = 89;
			String deptname = "개발";
			String loc = "서울";
			String sql = "insert into dept values("+deptno+",'"+deptname+"','"+loc+"')";

			int result = stmt.executeUpdate(sql);
			System.out.println("실행된 레코드 갯수:"+result);
			
			String sql2 = "select*from dept";
			rs = stmt.executeQuery(sql2);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+ rs.getString(3));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
	}
}
