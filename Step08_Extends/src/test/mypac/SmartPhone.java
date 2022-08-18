package test.mypac;

public class SmartPhone extends HandPhone {
	
	//생성자
	public SmartPhone() {
		// 부모생성자 즉 HandPhone 클래스의 생성자를 호출하는 표현식이다.
		//super(); //부모생성자 중에서 default 생성자를 호출할때는 생략가능하다.
		System.out.println("SmartPhone 생성자 호출됨");
	}
	//인터넷 기능
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	//사진찍는 메소드 재정의(override)하기
	@Override
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요");;
	}
}