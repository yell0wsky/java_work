package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		Weapon w1=new Weapon() {
			public void attack() {
				System.out.println("몰라 몰라 아무나 공격하자~");
			}
		};
		useWeapon(w1);
		
		// 지역변수 만들지 않고 바로 익명 클래스로 개체생성 후 참조값 전달하기
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("몰라 몰라 아무나 공격하자~");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	
}
		
