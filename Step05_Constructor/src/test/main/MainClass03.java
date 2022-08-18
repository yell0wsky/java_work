package test.main;
import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;
/*
 * [기본 data type의 참조 data type]
 * 
 * byte   : Byte
 * short  : Short
 * int    : Integer
 * long   : Long
 * 
 * float  : Float
 * double : Double
 * 
 * char	  : Character
 * boolean: Boolean
 *
 * - 때로는 기본데이터 type 의 참조데이터 type이 필요할 때가 있다.
 * - 기본데이터 type 을 객체에 포장(boxing)하는 형태이다.
 * - boxing 과 unboxing 은 자동으로 되기 때문에 프로그래머가 신경을 쓸 필요는 없다.
 */




public class MainClass03 {
	public static void main(String[] args) {
		//1. MacBook 객체를 생성해서 참조값을 mac1 이라는 지역 변수에 담아보세요.
		MacBook mac1=new MacBook(new Cpu(), new Memory(), new HardDisk());
		//2. mac1 지역 변수에 들어있는 참조값을 이용해서 doGame() 메소드를 호출해서 게임을 해 보세요.
		mac1.doGame();

		
		//1. MacBook 객체를 생성해서 참조값을 mac1 이라는 지역 변수에 담아보세요.
		Cpu cpu=new Cpu();
		Memory memory=new Memory();
		HardDisk harddisk=new HardDisk();
		MacBook mac2=new MacBook(cpu, memory, harddisk);
		//2. mac1 지역 변수에 들어있는 참조값을 이용해서 doGame() 메소드를 호출해서 게임을 해 보세요.
		mac2.doGame();
	}
}
