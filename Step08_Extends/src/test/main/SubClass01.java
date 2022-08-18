package test.main;

import test.auto.Car;
import test.auto.Engine;

public class SubClass01 {
	public static void main(String[] args) {
		Car test1=new Car(new Engine());
		
		test1.drive();
		
	}
}
