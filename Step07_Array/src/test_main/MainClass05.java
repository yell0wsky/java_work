package test_main;

import test_mypac.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		MemberDto dto=new MemberDto();
		
		//setter 메소드 테스트
		dto.setNum(1);
		dto.setName("황하늘");
		dto.setAddr("신림동");
		
		//getter 메소드 테스트
		int num=dto.getNum();
		String name=dto.getName();
		String addr=dto.getAddr();
		
		//생성자의 인자로 필드에 저장할 값을 모두 전달하면서 객체 생성
		MemberDto dto2=new MemberDto(2, "해골", "행신동");
	}
}
