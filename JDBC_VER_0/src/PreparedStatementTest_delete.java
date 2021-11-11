import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementTest_delete {

	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="scott";
		String passwd ="tiger";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("db 연결 성공");
			con = DriverManager.getConnection(url, userid, passwd);
			
			String query = "delete from dept where deptno=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 14);
			int num = pstmt.executeUpdate();
			
			System.out.println(num+"개 행이 삭제 되었습니다.");	
			
			String query2 = "select*from dept";
			pstmt = con.prepareStatement(query2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(deptno+"\t"+dname+"\t"+loc);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
