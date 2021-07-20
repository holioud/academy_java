package p2021_07_14;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Deleteboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("삭제할 글의 no를 입력하세요");
			int no = Integer.parseInt(br.readLine());
			
			String sql = "delete from board where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("no="+no+"번의 글이 삭제되었습니다");
			}else {
				System.out.println("글의 삭제를 실패하였습니다");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
