package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * 	ArrayList 객체에
		 * 
		 * 	친구 이름 5개를 담고
		 * 
		 * 	반복문 돌면서 친구 이름을 다음과 같은 형식으로 출력해 보세요.
		 * 
		 * 	0번째 친구: 김구라
		 *  1번째 친구: 해골
		 *  2번쨰 친구: 원숭이
		 *  .
		 *  .
		 *  .
		 *  
		 *  
		 */
		ArrayList<String> names2=new ArrayList<>();
		names2.add("김구라");
		names2.add("해골");
		names2.add("원숭이");
		names2.add("에이콘");
		names2.add("황하늘");
		
		for(int i=0; i<names2.size(); i++) {
			System.out.println(i+"번째 친구:"+names2.get(i));
		}
		
	}
}
