package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		//이미 존재하거나 혹은 만들 예정인 파일을 제어할 수 있는 File 객체 생성
		File f1=new File("c:/acorn202206/myFolder/gura.txt");
		//만일 해당 파일이 존재하면
		if(f1.exists()) {
			//삭제
			f1.delete();
			System.out.println("gura.txt 파일을 삭제 했습니다.");
		}else {//존재하지 않으면
			try {
				//새로운 파일 만들기
				f1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("gura.txt 파일을 만들었습니다.");
		};
		
		
	}
}
