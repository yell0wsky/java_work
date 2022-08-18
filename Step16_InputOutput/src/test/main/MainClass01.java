package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		
		/*	키보드와 연결된 InputStream type 의 참조값을 kbd라는 지역변수에 담기
		 * 	InputStream 객체는 1Byte 단위 처리 스트림 이다.
		 * 	영문자 대소문자, 숫자, 특수문자만 처리할 수 있다.
		 *  한글처리 불가 
		 */
		
		InputStream kbd=System.in;
		System.out.println("입력:");
		
		try {
			//입력한 문자의 코드값
			int code=kbd.read();
			System.out.println("code:"+code);
			//코드값에 대응되는 문자 얻어내기
			char ch=(char)code;
			System.out.println("char:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
