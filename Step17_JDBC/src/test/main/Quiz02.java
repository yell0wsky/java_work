package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.xml.transform.Result;

public class Quiz02 {
	public static void main(String[] args) {
		// DB 연결객체를 담을 지역 변수 만들기
		Connection conn = null;

		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";// XD
			// 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 실행할 sql 문
			// 콘솔창에 사원번호,부서번호,부서명,부서의 위치를 부서번호에 대해서 오름차순 정렬해서 출력해 보세요.
			String sql = "SELECT empno,deptno,dname,loc,hiredate"+
			" FROM emp"+" INNER JOIN dept USING(deptno)"+" ORDER BY deptno ASC";
			// PreparedStatement 객체의 참조값 얻어오기
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체를 이용해서 query 문 수행하고 결과를
			// ResultSet 객체로 받아오기
			rs = pstmt.executeQuery();
			/*
			 * ResultSet 객체의 .next() 메소드는 cursor 밑에 row가 존재하는지 확인해서 만일 존재하면 true를 리턴하고
			 * cursor 가 한칸 밑으로 이동한다. 만일 존재하지 않으면 false를 리턴한다.
			 */
			while (rs.next()) {
				// 현재 cursor가 위치한 곳에서 num 이라는 칼럼의 정수 얻어내기
				int empno = rs.getInt("empno");
				// 현재 cursor가 위치한 곳에서 name 이라는 칼럼의 문자열 얻어내기
				int deptno = rs.getInt("deptno");
				// 현재 cursor가 위치한 곳에서 addr 이라는 칼럼의 문자열 얻어내기
				String hiredate = rs.getString("hiredate");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(empno + "|" + deptno + "|" + dname + "|" + loc + "|" +hiredate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main 메소드가 종료됩니다.");
	}
}