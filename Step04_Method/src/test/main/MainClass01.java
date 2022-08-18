package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject 클래스에 정의된 3개의 메소드를 차례로 호출하는 Code를 작성해 보세요.
		MyObject myo=new MyObject();
		// return type이 없는 메소드 호출
		myo.walk();
		// return type이 int 인 메소드 호출
		int a=myo.getNumber();
		// return type이 String 인 메소드 호출
		String b=myo.getGreeting();
	
	}
}
