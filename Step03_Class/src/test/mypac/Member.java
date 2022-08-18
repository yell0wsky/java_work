package test.mypac;
/*
 *  Member 객체에 회원번호, 이름, 주소를 담고싶다면
 *  클래스를 어떻게 설계를 해야 할까?
 *  
 *  저장소(필드)가 3개 필요하다.
 *  필드의 type은 int, String, String 이 적당할 것 같음.
 */
public class Member {
	public int num;
	public String name;
	public String addr;
	
	//메소드
	public void showInfo() {
		//this 는 객체 자신의 참조값을 가리키는 예약어
		System.out.println("번호:"+this.num+" 이름:"+this.name+" 주소:"+this.addr);
	}
}
