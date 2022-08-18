package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		//삭제할 회원의 번호
		int num=1;
		//메소드 호출하면서 삭제할 회원의 번호 전달하기
		delete(num);
	}
	
	public static void delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn = new DBConnect().getConn();
			// 실행할 sql문
			String sql = "DELETE FROM member" + " WHERE num=?";
			// PreparedStatement 객체 얻어내기
			pstmt = conn.prepareStatement(sql);
			// ? 바인딩 할게 있으면 바인딩 한다.
			pstmt.setInt(1, num);
			// 실행
			pstmt.executeUpdate();
			System.out.println("회원정보를 삭제했습니다");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
