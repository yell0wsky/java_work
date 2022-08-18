package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass15 {
	public static void main(String[] args) {
		// 필요한 참조값을 담을 지역 변수를 미리 만든다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 1.jpg에서 byte 를 읽어낼 객체
			fis = new FileInputStream("c:/acorn202206/myFolder/1.jpg");
			// 2.copied.jpg 에 byte 를 출력할 객체
			fos = new FileOutputStream("c:/acorn202206/myFolder/copied.jpg");
			while (true) {
				// 1byte 읽어내기
				int data = fis.read();
				System.out.println(data);
				// 만일 다 읽었다면 반복문 탈출
				if (data == -1)
					break;
				// 읽어낸 1 byte 출력하기
				fos.write(data);
				fos.flush();
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
