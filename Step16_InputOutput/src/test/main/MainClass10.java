package test.main;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {
		File f1=new File("c:/acorn202206/myFolder/folder2");
		//폴더 만들기
		
		for(int i=0; i<1000; i++) {
			File tmp=new File("c:/acorn202206/myFolder"+"/folder"+(i+1));
			if(tmp.exists()) {
				tmp.delete();
			}else {
				tmp.mkdir();
			}
		}
		/*
		 * 위의 코드를 참고해서
		 * "c:/acorn202206/myFolder/folder1" 폴더 안에
		 * 폴더 1000개를 만들어보세요
		 * 폴더명은
		 * folder1
		 * folder2
		 * ...
		 * folder1000
		 */
	}
}
