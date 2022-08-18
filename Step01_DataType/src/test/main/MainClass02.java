package test.main;

public class MainClass02 {
	public static void main(String[] args) {
System.out.println("main 메소드가 시작되었습니다.");
		
		int kor=95;
		int eng=100;
		
		//국어 점수와 영어점수의 평균을 구해서 변수에 담고 그 걸과를 콘솔창에 출력해보시오
		
		//사칙연산 곱하기 나누기부터 계산한다.
		
		double avg = (kor+eng)/2.0;
		/*
		 * 정수와 정수를 연선하면 정수만 나오기 때문에
		 * 정확한 실수 값을 얻어내기 위해서는 연산에 참여하는 숫자중에 적어도 하나는 실수가 되어야 한다.
		 */
		
			System.out.println(avg);
	}
}
	