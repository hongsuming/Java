import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_update1 {

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
			System.out.println("드라이버 연결 성공");
			con = DriverManager.getConnection(url, userid, passwd);
			stmt = con.createStatement();
			String dname = "영업";
			String loc = "제주";
			int deptno = 90;
			String sql = "update dept set dname='"+dname+"', loc='"+loc+"' where deptno="+deptno;
			System.out.println(sql);
			int num = stmt.executeUpdate(sql);
			System.out.println(num+"개 update 되었습니다.");
			
			String selectSql = "select*from dept where deptno="+deptno;
			rs = stmt.executeQuery(selectSql);
			while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+ rs.getString(3));
			}
			
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
