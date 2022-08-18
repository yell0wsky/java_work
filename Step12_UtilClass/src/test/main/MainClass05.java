package test.main;

import java.util.ArrayList;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * ArrayList는 기본데이터 type을 저장할 수 없으므로
		 * 기본데이터 type 을 저장하고 싶으면 Wrapper Class를 활용하면 된다.
		 * int =>Integer
		 * double => Double
		 * boolean => Boolean 등등
		 */ 
		
<<<<<<< HEAD
		ArrayList<Integer> nums=new ArrayList<>();
=======
		ArrayList<Integer> nums=new ArrayList<Integer>();
>>>>>>> 082e9845352121d7df166b00a109b591c0064b90
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//확장 for 문을 이용해서 저장된 정수를 순서대로 콘솔창에 출력하기
		for(Integer tmp : nums) {
			System.out.println(tmp);
		}
	}
}
