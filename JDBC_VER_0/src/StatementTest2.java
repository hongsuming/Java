import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest2 {

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
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("드라이버 연결 완료");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select*from dept");
			ResultSetMetaData mrs = rs.getMetaData();
			int count = mrs.getColumnCount(); // 컬럼 수 : 3
			for(int i=1; i<=count; i++) {
				System.out.print(mrs.getColumnName(i)+"\t");
			}
			System.out.println();
			System.out.println("-----------------------------");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs!=null)
				try {
					rs.close();
					if(stmt!=null)stmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
