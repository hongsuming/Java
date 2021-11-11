import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_WhereTest {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩------------------------");
			con = DriverManager.getConnection(url, userid, passwd);
			String name = "SALES";
			String sql = "select deptno x, dname, loc from dept"; 
			sql+=" where dname='"+name+"'";
			System.out.println(sql);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno+"\t"+dname+"\t"+loc);
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
