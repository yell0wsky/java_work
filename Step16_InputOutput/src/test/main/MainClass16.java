package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass16 {
	public static void main(String[] args) {
		// 필요한 참조값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 1.jpg에서 byte 를 읽어낼 객체
			fis = new FileInputStream("c:/acorn202206/myFolder/1.jpg");
			// 2.copied.jpg 에 byte 를 출력할 객체
			fos = new FileOutputStream("c:/acorn202206/myFolder/copied.jpg");
			//byte 알갱이를 담을 방 1024개짜리 byte[] 객체 생성
			byte[] buffer=new byte[1024];
			while (true) {
				//byte[] 객체를 read() 메소드에 전덣서 byte를 읽어내고 몇byte를 읽었는지를 리턴 받는다.
				int readedByte=fis.read(buffer);
				//만일 더이상 읽을 byte가 없다면
				if(readedByte==-1)break;
				//읽은 만큼 fos 객체를 이용해서 출력하기(0번 방부터 읽은만큼)
				fos.write(buffer, 0, readedByte);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fos, fis 마무리하기
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
