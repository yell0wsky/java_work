package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {

	// 1. 전체 회원의 목록을 리턴하는 메소드
	public List<MemberDto> getlist() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDto> members = new ArrayList<>();
		MemberDto dto = null;
		try {
			String sql = "SELECT * FROM member";
			// PreparedStatement 객체의 참조값 얻어오기
			conn = new DBConnect().getConn();
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체를 이용해서 query 문 수행하고 결과를
			// ResultSet 객체로 받아오기
			rs = pstmt.executeQuery();
			/*
			 * ResultSet 객체의 .next() 메소드는 cursor 밑에 row가 존재하는지 확인해서 만일 존재하면 true를 리턴하고
			 * cursor 가 한칸 밑으로 이동한다. 만일 존재하지 않으면 false를 리턴한다.
			 */

			while (rs.next()) {
				// MemberDto 객체를 생성해서
				dto = new MemberDto();
				// 지역변수에 있는 회원번호를 담고
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				members.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return members;
	}

	// 2. 특정 회원 한명의 정보를 리턴하는 메소드
	public MemberDto select(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto dto = null;
		try {
			// 실행할 sql 문
			conn = new DBConnect().getConn();
			String sql = "SELECT * FROM member" + " Where num=?";
			// PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체를 이용해서 query 문 수행하고 결과를
			// ResultSet 객체로 받아오기
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			/*
			 * ResultSet 객체의 .next() 메소드는 cursor 밑에 row가 존재하는지 확인해서 만일 존재하면 true를 리턴하고
			 * cursor 가 한칸 밑으로 이동한다. 만일 존재하지 않으면 false를 리턴한다.
			 */

			if (rs.next()) {
				// MemberDto 객체를 생성해서
				dto = new MemberDto();
				// 지역변수에 있는 회원번호를 담고
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return dto;
	}

	// 회원 한명의 정보를 추가하고 성공여부를 리턴하는 메소드
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화된(추가, 수정, 삭제) 행의 갯수를 담을 지역변수를 미리 만들어 둔다.
		int updatedRowCount = 0;
		try {
			// DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn = new DBConnect().getConn();
			// 실행할 sql 문
			String sql = "INSERT INTO member" + " (num, name, addr)" + " VALUES(member_seq.NEXTVAL, ?, ?)";
			// PreparedStatement 객체 얻어내기
			pstmt = conn.prepareStatement(sql);
			// ? 바인딩 할게 있으면 바인딩 한다.
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());

			// 실행후 메소드가 리턴해주는 변화된 행의 갯수를 지역변수에 담는다.
			updatedRowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		// 만일 변화된 행의 갯수가 0보다 크면
		if (updatedRowCount > 0) {
			// 작업 성공의 의미이기 때문에 true 를 리턴하고
			return true;
		} else {
			// 작업이 실패면 false 를 리턴한다.
			return false;
		}
	}

	// 회원 한명의 정보를 수정하고 성공여부를 리턴하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화된(추가, 수정, 삭제) 행의 갯수를 담을 지역변수를 미리 만들어 둔다.
		int updatedRowCount = 0;
		try {
			// DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn = new DBConnect().getConn();
			// 실행할 sql 문
			String sql = "UPDATE member" + " SET name=?, addr=?" + " WHERE num=?";
			// PreparedStatement 객체 얻어내기
			pstmt = conn.prepareStatement(sql);
			// ? 바인딩 할게 있으면 바인딩 한다.
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			// 실행후 메소드가 리턴해주는 변화된 행의 갯수를 지역변수에 담는다.
			updatedRowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		// 만일 변화된 행의 갯수가 0보다 크면
		if (updatedRowCount > 0) {
			// 작업 성공의 의미이기 때문에 true 를 리턴하고
			return true;
		} else {
			// 작업이 실패면 false 를 리턴한다.
			return false;
		}
	}

	// 회원 한명의 정보를 삭제하고 성공여부를 리턴하는 메소드
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화된(추가, 수정, 삭제) 행의 갯수를 담을 지역변수를 미리 만들어 둔다.
		int updatedRowCount = 0;
		try {
			// DBConnect 객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn = new DBConnect().getConn();
			// 실행할 sql 문
			String sql = "DELETE FROM member" + " WHERE num=?";
			// PreparedStatement 객체 얻어내기
			pstmt = conn.prepareStatement(sql);
			// ? 바인딩 할게 있으면 바인딩 한다.
			pstmt.setInt(1, num);

			// 실행후 메소드가 리턴해주는 변화된 행의 갯수를 지역변수에 담는다.
			updatedRowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		// 만일 변화된 행의 갯수가 0보다 크면
		if (updatedRowCount > 0) {
			// 작업 성공의 의미이기 때문에 true 를 리턴하고
			return true;
		} else {
			// 작업이 실패면 false 를 리턴한다.
			return false;
		}
	}

}
