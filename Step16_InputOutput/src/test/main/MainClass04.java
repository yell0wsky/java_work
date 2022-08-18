package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//학습을 위해서 PrintStream 객체를 부모 type Output
		//OutputStream 도 1byte 처리 스트림이다.
		OutputStream os=ps;
		try {
			os.write(97);
			os.write(98);
			os.write(44032);
			os.flush(); //방출
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
