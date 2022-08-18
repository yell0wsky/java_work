package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	/*
	 *  Weapon 추상클래스를 상속받은 inner class
	 *  
	 *  main() 메소드는 static 메소드 이기 때문에 main() 메소드 에서 사용하려면
	 *  
	 *  inner class 도 static 영역에 올라가 있어야 하기 때문에 static 예약어가 필요하다.
	 */
	static class Gun extends Weapon{
		@Override
		public void attack() {
			System.out.println("빵야~");
		}
	}
	public static void main(String[] args) {
		Weapon w1=new Gun();
		useWeapon(w1);
		
		class Missile extends Weapon{
			@Override
			public void attack() {
				System.out.println("미사일로 공격해요!");
			}
		}
		Weapon w2=new Missile();
		useWeapon(w2);
		
		useWeapon(new Missile());
	}
	
	//객체를 생성해서 지역변수에 담지 않고 바로 생성해서 useWeapon() 메소드 호출하기
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
