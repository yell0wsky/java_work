package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		int num = 1;
		String name = "황하늘";
		String addr = "신림동";

		// 추가할 회원의 정보를 MemberDto 객체를 생성해서 담는다.
		MemberDto dto = new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);

		// MemberDao 객체를 생성해서
		MemberDao dao = new MemberDao();
		// insert() 메소드를 이용해서 회원의 정보를 추가하고 성공여부를 리턴받는다.
		boolean isSuccess = dao.update(dto);

		if (isSuccess == true) {
			System.out.println("회원정보를 수정했습니다.");
		} else {
			System.out.println("수정 실패!");
		}
	}
}