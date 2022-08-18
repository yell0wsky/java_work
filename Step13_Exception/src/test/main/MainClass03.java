package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		try {
			Thread.sleep(5000);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다.");
		
	}
}
