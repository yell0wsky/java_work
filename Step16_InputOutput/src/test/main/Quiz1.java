package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*	Quiz1
 *	Scanner 객체를 이용해서 문자열 한줄을 입력받은 다음
 *	c:/acorn20220/myFolder/quiz.txt 파일을 만들어서
 *	해당 파일에 문자열을 저장해 보세요
 * 
 * 	Quiz2
 * 	JTextField에 문자열을 입력하고 추가버튼을 누르면
 * 	입력한 문자열이 c:/acorn202206/myFolder/memo.txt 파일에 append 되도록 해보세요
 * 
 *	불러오기 버튼을 누르면 c:/acorn202206/myFolder/memo.txt 파일에 있는 모든 문자열을
 *	JTextArea에 출력하도록 해보세요.
 */

public class Quiz1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("문자를 입력하세요: ");
		String line=scan.nextLine();
		FileWriter fw;
		try {
			fw = new FileWriter("c:/acorn202206/myFolder/quiz.txt");
			fw.write(line);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
