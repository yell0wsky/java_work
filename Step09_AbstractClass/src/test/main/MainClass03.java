package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		//1. Zoo 객체를 생성해서 참조값을 z 라는 지역 변수에 담아 보세요
		Zoo z=new Zoo();
		
		//2. z 안에 있는 참조값을 이용해서 getMonkey() 메소드를 호출해서 리턴되는 값을
		//	m1이라는 지역 변수에 담아보세요.
		Monkey m1=z.getMonkey();
		
		//3. m1 안에 있는 참조값을 이용해서 say() 메소드를 호출해 보세요.
		m1.say();
		
		// Zoo 클래스에 있는 getTiger() 메소드를 호출해서
		// 리턴되는 값을 t1 이라는 지역변수에 담아보세요
		Tiger t1=z.getTiger();
		
		// t1 안에 있는 참조값을 이용해서 say() 메소드를 호출해 보세요.
		t1.say();
		
		// 메소드 안에도 클래스를 정의할 수 있다. 해당 메소드 안에서만 사용할 수 있다.
		class Gura{
			public void say() {
				System.out.println("안녕 나는 구라야!");
			}
		}
		Gura g1=new Gura();
		g1.say();
	}
}