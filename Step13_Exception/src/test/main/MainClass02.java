package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("나눌 수 입력");
		String inputNum1=scan.nextLine();
		System.out.println("나누어 지는 수 입력:");;
		String inputNum2=scan.nextLine();
		try {
			int num1=Integer.parseInt(inputNum1);
			int num2=Integer.parseInt(inputNum2);
			
			int result=num2/num1; //몫
			int result2=num2%num1; //나머지
<<<<<<< HEAD
			System.out.println(num2+" 를 "+num1+" 으로 나눈 몫 :"+result);
			System.out.println(num2+" 를 "+num1+" 으로 나눈 나머지 :"+result2);
=======
			System.out.println(num2+" 를" )+num1+" 으로 나눈 몫 :"+result);
			System.out.println(num2+" 를" )+num1+" 으로 나눈 나머지 :"+result2);
>>>>>>> 082e9845352121d7df166b00a109b591c0064b90
		}catch(NumberFormatException nfe) {
			System.out.println("숫자 형식으로 입력해 주세요");
		}catch(ArithmeticException ae) {
			System.out.println("어떤 수를 0으로 나눌 수는 없어요");
		}
	}
}
