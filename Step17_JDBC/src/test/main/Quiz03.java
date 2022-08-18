package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//회원정보가 아닌 다른정보를 담을 수 있는 테이블을 만들고 시퀀스도 만들어서
//MainClass01~MainClass11에서 했던 과정을 순서대로 밟아보세요
//예)CREATE TABLE friend(num NUMBER PRIMARY KEY, name VARCHAR2(20),phone VARCHAR2(20))
//CREATE SEQUENCE friend_seq
//FriendDto 클래스도 만들어야겠죠

//회원정보(member테이블)을 추가, 수정, 삭제, 목록 불러오기 기능을 JFrame 상에서 구현해보세요.

public class Quiz03 extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField tf1, tf2, tf3;
	JLabel label1, label2, label3;
	JTextArea ta;
	
	public Quiz03() {
		setLayout(new BorderLayout());
		JPanel topPanel = new JPanel();
		JPanel CenterPanel = new JPanel();
		JPanel BottomPanel = new JPanel();
		add(topPanel, BorderLayout.NORTH);
		add(CenterPanel, BorderLayout.CENTER);
		add(BottomPanel, BorderLayout.SOUTH);
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		ta = new JTextArea(20, 20);
		label1=new JLabel("번호");
		label2=new JLabel("이름");
		label3=new JLabel("포지션");
		topPanel.add(label1);
		topPanel.add(tf1);
		topPanel.add(label2);
		topPanel.add(tf2);
		topPanel.add(label3);
		topPanel.add(tf3);
		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("수정");
		JButton btn3 = new JButton("삭제");
		JButton btn4 = new JButton("불러오기");
		btn1.setSize(100, 50);
		btn2.setSize(100, 50);		
		btn3.setSize(100, 50);		
		btn4.setSize(150, 100);		
		CenterPanel.add(btn1);
		CenterPanel.add(btn2);
		CenterPanel.add(btn3);
		CenterPanel.add(btn4);
		BottomPanel.add(ta);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}

	public static void main(String[] args) {
	      Quiz03 q=new Quiz03();
	      q.setTitle("로스터 입력기");
	      q.setSize(600,600);
	      q.setVisible(true);
	      q.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command=e.getActionCommand();	
		
		if(command.equals("추가")) {
			int Jnum=Integer.parseInt(tf1.getText());
			String Jname=tf2.getText();
			String Jposition=tf3.getText();
			SpursAdd.main(Jnum, Jname, Jposition);
			
		}
		if(command.equals("불러오기")) {
			SpursView.main(null);
		}
	}
}