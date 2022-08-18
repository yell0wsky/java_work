package test.main;

import java.util.HashMap;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 회원정보는 숫자(int), 문자(String) 으로 구성되어 있기 떄문에
		 * value의 generic은 Object로 지정해야 한다.
		 */
		HashMap<String, Object> map=new HashMap<>();
		//value 의 generic 이 Object 이기 때문에 어떤 type 이든지 담을 수 있다.
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		
		int num=(int)map.get("num");
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
	}
}
