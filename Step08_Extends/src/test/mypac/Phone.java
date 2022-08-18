package test.mypac;

//아무것도 상속받지 않는 클래스는 자동으로 (보이지 않는) Obejct 클래스를 상속받는다.
public class Phone {
	
	//생성자
	public Phone() {
		System.out.println("Phone 생성자 호출됨");
	}
	//전화거는 메소드
	public void call() {
		System.out.println("전화를 걸어요!");
	}
}
