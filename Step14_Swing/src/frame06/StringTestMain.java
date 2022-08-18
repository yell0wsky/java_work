package frame06;

public class StringTestMain {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		String name1="김구라";
		String name2="김구라";
		String name3=new String("김구라");
		String name4=new String("김구라");
		
		char[] arr= {'김','구','라'};
		String name5=new String(arr);
	}	
}
