package test.main;

import java.util.ArrayList;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		//1. Car type 을 저장할 수 있는 ArrayList 객체를 생성해서
		//참조값을 ArrayList type 지역변수 cars에 담아보세요.
		ArrayList<Car> cars=new ArrayList<>();
		
		
		//2. Car 객체(3개)를 생성해서 List 객체에 저장해 보세요.
		cars.add(new Car("벤츠"));
		cars.add(new Car("아우디"));
		cars.add(new Car("람보르기니"));
		
		
		//3. 반복문 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의
		//drive() 메소드를 순서대로 호출해 보세요.
		for(Car tmp: cars) {
			tmp.drive();
		}
		
	}	
}