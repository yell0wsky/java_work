package test_main;

import test_mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//1.MemberDto 객체를 3개 생성해서 각각의 객체에 회원의 정보를 담아보세요.(3명의 정보)
		MemberDto mem1=new MemberDto(1, "김구라", "노량진");
		MemberDto mem2=new MemberDto(2, "해골", "행신동");
		MemberDto mem3=new MemberDto(3, "원숭이", "상도동");
		
		//2.MemberDto 객체의 참조값 3개를 저장할 수 있는 배열객체를 생성해서 참조값을 members 라는 지역변수에 담아보세요.
		MemberDto[] members=new MemberDto[3];
		
		//3.members 배열에 1. 에서 생성한 MemberDto 객체의 참조값 3개를 순서대로 담아 보세요.
		members[0]=mem1;
		members[1]=mem2;
		members[2]=mem3;
		
		/*
		 * 4. 반복문 돌면서 members 배열에 담긴 MemberDto 객체를 하나씩 참조해서 아래와 같은 형식으로
		 * 회원정보를 콘솔창에 출력해 보세요.
		 * 
		 * 번호:1, 이름:김구라, 주소:노량진
		 * 번호:2, 이름:해골, 주소:행신동
		 * 
		 */
		for(int i=0; i<members.length; i++) {
			MemberDto tmp=members[i];
			System.out.println("번호:"+tmp.getNum()+", 이름:"+tmp.getName()+", 주소:"+tmp.getAddr());
		}
	}
}
