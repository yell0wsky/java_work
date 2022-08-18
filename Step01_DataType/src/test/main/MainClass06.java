package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		//메인 메소드 안쪽에서 만드는 변수를 '지역변수'라고 한다.
		//Java는 전역변수의 개념이 존재하지 않는다. '지역변수'or'필드'만이 존재
		System.out.println("main 메소드가 시작 되었습니다.");
		
		int num1;
		String name1;
		
		num1=10;
		//Java는 변수값을 집어넣기 이전에는 변수가 만들어지지 않는다.(선언만 하고 대기상태로 남는다. 이후 변수추가가능)
		
		int result=10+num1;
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
