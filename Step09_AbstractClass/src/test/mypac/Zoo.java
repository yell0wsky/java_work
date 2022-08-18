package test.mypac;

public class Zoo {
	/*
	 * 클래스 안에 정의 할 수 있는게 뭐가 있지요?
	 * 
	 * 생성자, 필드, 메소드, 클래스
	 * 
	 */
	//클래스 안에 클래스(내부 클래스)
	public class Monkey{
		public void say() {
			System.out.println("안녕! 나는 원숭이야");
		}
	}
	//내부 클래스
	public class Tiger{
		public void say() {
			System.out.println("안녕! 나는 호랑이야");
		}
	}
	public Monkey getMonkey() {
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}