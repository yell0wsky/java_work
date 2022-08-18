package test.auto;

public class CampingCar extends Car {
	public CampingCar(Engine engine) {
		super(engine);
	}
	public void makeMill() {
		System.out.println("밥을 지어요");
	}
		
	public void washDish() {
		System.out.println("설거지를 해요");
	}
}
