package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 	Scanner 객체를 이용해서 반복문 돌면서 친구 이름ㅇ르 3번 입력받아서
		 * 	입력받은 이름을 ArrayList 객체에 순서대로 저장을 하는 프로그래밍을 해보세요.
		 */
		
		ArrayList<String> friends=new ArrayList<>();
		
		for(int i=0; i<3; i++) {
		Scanner scan=new Scanner(System.in);
		System.out.println("친구이름을 입력하세요:");
		String line=scan.nextLine();
		friends.add(line);
		
		System.out.println((i+1)+"번째 추가된 친구의 이름 : "+friends.get(i));
		};
		for(String tmp:friends) {//확장 for문
			System.out.println(tmp);
		}
		
	}
}
