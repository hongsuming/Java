import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

	public static void main(String[] args) {
		
		// 1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		
		// 2. 드라이버 생성 -> new 이용
		Connection con = null; // DB 접속, DriverManager를 통해 얻어 옴
//		PreparedStatement pstmt = null; // sql 실행해줄 객체, Connection에서 얻어 옴
		Statement stmt = null; // sql 실행해줄 객체, Connection에서 얻어 옴
		ResultSet rs = null;   // sql select 결과 저장 객체, Statement의 executeQuery 실행 결과를 얻어 옴

		try {
			// 2. 드라이버 생성 (로딩)
			Class.forName(driver);
			// 3. 오라클 연결 (connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("드라이버 연결 성공---------------------------------"+con);
			// 4. sql 작성
			String sql = "select * from dept";
			// 5. SQL 실행
			stmt = con.createStatement();
			// 6. 실행해서 결과 받기
			rs = stmt.executeQuery(sql);
			// 6-1. SQL 실행 결과 출력
			ResultSetMetaData mrs = rs.getMetaData();
			int count = mrs.getColumnCount(); // 컬럼 수 : 3
			for(int i=1; i<=count; i++) {
				System.out.print(mrs.getColumnName(i)+"\t");
			}
			System.out.println();
			System.out.println("========================================");
			while(rs.next()) {
				// 컬럼명
				int deptno=rs.getInt("deptno");
				String dname=rs.getString("dname");
				String loc=rs.getString("loc");
				// 인덱스 번호
//				int deptno=rs.getInt(1);
//				String dname=rs.getString(2);
//				String loc=rs.getString(3);
				System.out.println(deptno+"\t"+dname+"\t"+loc);
			} // while end
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클 드라이버 로딩 실패----------------------------");
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 연결 실패-------------------------------");
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}		
	}
}
