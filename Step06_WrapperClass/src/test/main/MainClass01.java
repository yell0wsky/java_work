package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//기본 데이터 type
		int num1=10;
		//참조 데이터 type
		Integer num2=10;
		
		//참조데이터 type 이지만 기본 데이터 type 처럼 사용할 수 있다.
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		//문자를 숫자로 바꾸기
		String strNum="999";
				
		int result4=Integer.parseInt(strNum);
	}
}
