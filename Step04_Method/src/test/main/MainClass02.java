package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		//Car 객체의 참조값을 얻어내서 drive() 메소드를 여기서 호출해 보세요
		
		new MyObject().getCar().drive();
		
		// 위의 1줄을 풀어서 쓰면 아래와 같다
		MyObject obj=new MyObject();
		Car car1=obj.getCar();
		car1.drive();		
	}
}