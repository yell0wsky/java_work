package test.main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass03 {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(300, 400);
		f.setTitle("오잉 제목?");
		f.setVisible(true);
		f.setLayout(new BorderLayout());
		
		JButton btn=new JButton();
		btn.setText("눌러보셈");
		f.add(btn, BorderLayout.NORTH);
		f.setVisible(true);
	}
}
