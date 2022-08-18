package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		int num = 6;

		// MemberDao 객체를 생성해서
		MemberDao dao = new MemberDao();
		// insert() 메소드를 이용해서 회원의 정보를 추가하고 성공여부를 리턴받는다.
		boolean isSuccess = dao.delete(num);

		if (isSuccess == true) {
			System.out.println("회원정보를 삭제했습니다.");
		} else {
			System.out.println("삭제 실패!");
		}
	}
}
