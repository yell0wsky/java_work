package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		//문자열을 조장할 파일을 만들기 위한 File 객체
		File memoFile=new File("c:/acorn202206/myFolder/memo.txt");
		//필요한 값을 담을 지역변수를 미리 만든다
		FileReader fr=null;
		BufferedReader br=null;		
		try {
			//파일에서 문자열을 읽어들일 수 있는 객체 생성
			fr=new FileReader(memoFile);
			br=new BufferedReader(fr);
			while(true) {
				//문자열 한줄 읽어내기
				String line=br.readLine();//개행 기호는 읽어내지 않는다
				//더이상 읽을 데이터가 없으면 반복문 탈출
				if(line==null) {
					break;
				}
				System.out.println(line);
			}
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//예외가 발생 하던 안하던 실행이 반드시 보장되는 블럭
			try {//예외가 발생한다면 try ~ catch 블럭으로 묶어주고
				//NullPointException을 방지하면서 마무리작업을 한다.
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}