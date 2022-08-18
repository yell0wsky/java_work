package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		/*
		 * FileReader 객체를 활용해서
		 * 
		 * c:/acorn202206/myFolder/memo.txt 파일에 있는 모든 문자를 콘솔창에 출력하는 코드를 작성해보세요
		 * 
		 * -hint
		 *1. 반복문 돌면서 한글자씩 읽어내야 한다.
		 *2. 반복문을 볓번 돌아야 하는지 확실치않다.
		 *3. 읽어낸 코드랎을 char type 으로 casting 해야 문자 1개를 확인 할 수 있다.
		 *4. 개행하지 않고 콘솔에 출력하는 방법은 System.out.print() 메소드를 활용하면 된다.
		 */
		File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
		try {
			FileReader fr=new FileReader(memoFile);
						
			while(true) {
				int code=fr.read();
				if(code == -1) {
					break;
				}
				
				System.out.println((char)code);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}