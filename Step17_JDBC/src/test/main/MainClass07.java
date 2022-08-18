package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass07 {

	public static void main(String[] args) {
		// member 테이블에 추가할 회원의 정보
		String name = "주뎅이";
		String addr = "봉천동";

		// 회원 한명의 정보를 MemberDto 객체에 담고
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);

		insert(dto);

	}

	public static void insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn = new DBConnect().getConn();
			// 실행할 sql문
			String sql = "INSERT INTO member" + "(num, name, addr)" + "VALUES(member_seq.NEXTVAL, ?, ?)";
			// PreparedStatement 객체 얻어내기
			pstmt = conn.prepareStatement(sql);
			// ? 바인딩 할게 있으면 바인딩 한다.
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// 실행
			pstmt.executeUpdate();
			System.out.println("회원정보를 저장했습니다");

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