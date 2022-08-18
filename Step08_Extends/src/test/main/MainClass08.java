package test.main;

import test.auto.CampingCar;
import test.auto.Engine;

public class MainClass08 {
	public static void main(String[] args) {
		CampingCar car2=new CampingCar(new Engine());
		car2.makeMill();
		car2.washDish();
		String tmp="10"+10;
	}
}
