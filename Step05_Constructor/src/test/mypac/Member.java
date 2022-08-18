package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	//아무런 값도 전달받지 않는 기본 생성자
	public Member() {
		System.out.println("기본 생성자가 호출되었습니다.");
	}
	
	//필드에 저장할 값을 전달 받는 생성자
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
}
