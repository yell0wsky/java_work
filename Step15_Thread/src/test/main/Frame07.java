<<<<<<< HEAD
package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import test.mypac.CountRunnable;
import test.mypac.CountThread;
/* 
 * 프레임을 하나 만들고
 * 프레임에 숫자를 입력하고 실행하기 버튼을 누르면
 * 구구단 하나가 콘솔창에 출력되는 프로그래밍을 해보세요
 * 예) 2를 JTextField에 입력하고 실행하기 버튼을 누르면
 * 
 * 2x1=2
 * 2x2=3
 * 2x3=6
 * ...
 * 2x9=18
 * 
 * 단, 1초에 1줄씩 출력이 되도록하고, 출력하는 작업은 새로운 스레드에서 출력하도록 하세요.
 */

public class Frame07 extends JFrame implements ActionListener{
   //필드
   JTextField tf_num;
   //생성자
   public Frame07() {
      //레이아웃 설정 
      setLayout(new BorderLayout());
      //페널을 프레임의 상단에 배치 
      JPanel panel=new JPanel();
      add(panel, BorderLayout.NORTH);
      
      //JTextField 객체를 만들에서 JPanel 에 추가하기
      tf_num=new JTextField(10);
      panel.add(tf_num);
      //버튼을 페널에 추가 하고 
      JButton countBtn=new JButton("실행하기");
      panel.add(countBtn);
      //버튼에 리스너 등록하기
      countBtn.addActionListener(this);
   }
   public static void main(String[] args) {
   //MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame 에 담기 
   Frame07 frame=new Frame07();
   //프레임의 제목 설정
   frame.setTitle("Times Table");
   //프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setBounds(100, 100, 500, 500);
   frame.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      
      new Thread(()->{
         String strNum1=tf_num.getText();
         int num=Integer.parseInt(strNum1);
         for(int i=1; i<10; i++) {
            int result=num*i;
            String StrResult=Integer.toString(result);
            System.out.println(num+"x"+i+"="+StrResult);
            try {
               Thread.sleep(1000);
            } catch (InterruptedException e1) {
               e1.printStackTrace();
            }
         }
      }).start();
   }
=======
package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import test.mypac.CountRunnable;
import test.mypac.CountThread;
/* 
 * 프레임을 하나 만들고
 * 프레임에 숫자를 입력하고 실행하기 버튼을 누르면
 * 구구단 하나가 콘솔창에 출력되는 프로그래밍을 해보세요
 * 예) 2를 JTextField에 입력하고 실행하기 버튼을 누르면
 * 
 * 2x1=2
 * 2x2=3
 * 2x3=6
 * ...
 * 2x9=18
 * 
 * 단, 1초에 1줄씩 출력이 되도록하고, 출력하는 작업은 새로운 스레드에서 출력하도록 하세요.
 */

public class Frame07 extends JFrame implements ActionListener{
	//필드
	JTextField tf_num;
	//생성자
	public Frame07() {
		//레이아웃 설정 
		setLayout(new BorderLayout());
		//페널을 프레임의 상단에 배치 
		JPanel panel=new JPanel();
		add(panel, BorderLayout.NORTH);
      
		//JTextField 객체를 만들에서 JPanel 에 추가하기
		tf_num=new JTextField(10);
		panel.add(tf_num);
		//버튼을 페널에 추가 하고 
		JButton countBtn=new JButton("실행하기");
		panel.add(countBtn);
		//버튼에 리스너 등록하기
		countBtn.addActionListener(this);
	}
	public static void main(String[] args) {
	//MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame 에 담기 
	Frame07 frame=new Frame07();
	//프레임의 제목 설정
	frame.setTitle("Times Table");
	//프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(100, 100, 500, 500);
	frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		new Thread(()->{
			String strNum1=tf_num.getText();
			int num=Integer.parseInt(strNum1);
			for(int i=1; i<10; i++) {
				int result=num*i;
				String StrResult=Integer.toString(result);
				System.out.println(num+"x"+i+"="+StrResult);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}).start();
	}
>>>>>>> 082e9845352121d7df166b00a109b591c0064b90
}