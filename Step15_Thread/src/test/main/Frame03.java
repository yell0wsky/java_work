package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import test.mypac.CountThread;

public class Frame03 extends JFrame implements ActionListener{
   
   //생성자
   public Frame03() {
      //레이아웃 설정 
      setLayout(new BorderLayout());
      //페널을 프레임의 상단에 배치 
      JPanel panel=new JPanel();
      panel.setBackground(Color.YELLOW);
      add(panel, BorderLayout.NORTH);
      //버튼을 페널에 추가 하고 
      JButton countBtn=new JButton("1~10 까지 세기");
      panel.add(countBtn);
      //버튼에 리스너 등록하기
      countBtn.addActionListener(this);
   }
   
   public static void main(String[] args) {
      //MyFrame 클래스를 이용해서 객체 생성하고 참조값을 지역변수 frame 에 담기 
      Frame02 frame=new Frame02();
      //프레임의 제목 설정
      frame.setTitle("Frame02");
      //프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }

<<<<<<< HEAD
   @Override
	public void actionPerformed(ActionEvent e) {
	
		Thread t=new Thread(new Runnable() {
			public void run() {
				//run 메소드 안쪽이 새로운 작업 단위가 된다.
				//run 메소드 안쪽이 새로운 작업 단위가 된다.
				int count=0;
				while(true) {
					try {
		            Thread.sleep(1000);
		         } catch (InterruptedException e) {
		            e.printStackTrace();
		         }
		         count++;
		         System.out.println("현재 카운트:"+count);
		         if(count==10) {
		            break;
		         }
				}
			};
		});
};}
=======
@Override
public void actionPerformed(ActionEvent e) {

	Thread t=new Thread(new Runnable() {
		public void run() {
			//run 메소드 안쪽이 새로운 작업 단위가 된다.
			//run 메소드 안쪽이 새로운 작업 단위가 된다.
      int count=0;
      while(true) {
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
         count++;
         System.out.println("현재 카운트:"+count);
         if(count==10) {
            break;
         }
      }
		}
	}
}
>>>>>>> 082e9845352121d7df166b00a109b591c0064b90
