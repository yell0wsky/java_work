package test.main;

import java.util.Random;

import test.mypac.SleepyException;

public class MainClass05 {
	public static void main(String[] args) {
		Random ran=new Random();
		
<<<<<<< HEAD
		for(int i=0; i<100; i++) {
=======
		for(int i-0; i<100, i++) {
>>>>>>> 082e9845352121d7df166b00a109b591c0064b90
			//0~9 사이의 랜덤한 정수를 발생시킨다.
			int ranNum=ran.nextInt(10);
			if(ranNum==5) {//우연히 랜덤한 정수가 5가 나오면 예외를 발생시킨다.
				//throw new SleepyExvception("너무 졸려~~");
				
			}
<<<<<<< HEAD
			System.out.println((i+1)+"번쨰 작업중");
			
=======
			System.out.println(i+1)"번쨰 작업중";
			SleepyException
>>>>>>> 082e9845352121d7df166b00a109b591c0064b90
		}
	}
}
