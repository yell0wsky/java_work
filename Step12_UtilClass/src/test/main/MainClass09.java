package test.main;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass09 {
	public static void main(String[] args) {
		HashMap<String, String> dic=new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("검색할 단어를 입력하세요:");
			String line=scan.nextLine();
			
			/*
			 * 검색할 단어를 입력하세요:house 
			 * house의 뜻은 집입니다.
			 * 
			 * 검색할 단어를 입력하세요:gura
			 * gura는 목록에 없습니다.
			 */
			
			if(dic.get(line)!=null) {
				System.out.println(line+"의 뜻은 "+dic.get(line)+"입니다.\n");
			}else {
				System.out.println(line+" 는 목록에 없습니다.\n");
				}		
		}
		
		// dic.containsKey(line) 활용 가능
	}
}
