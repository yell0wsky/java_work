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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz2 extends JFrame implements ActionListener {
   JTextField tf;
   JTextArea ta;
   
   public Quiz2() {
      setLayout(new BorderLayout());
      JPanel topPanel=new JPanel();
      JPanel CenterPanel=new JPanel();
      JPanel BottomPanel=new JPanel();
      add(topPanel,BorderLayout.NORTH);
      add(CenterPanel,BorderLayout.CENTER);
      add(BottomPanel,BorderLayout.SOUTH);
      tf=new JTextField(20);
      JButton btn1=new JButton("입력");
      btn1.setSize(100, 50);
      JButton btn2=new JButton("불러오기");
      btn2.setSize(100, 50);
      ta=new JTextArea(15, 15);
      topPanel.add(tf);
      CenterPanel.add(btn1);
      CenterPanel.add(btn2);
      BottomPanel.add(ta);
      
      btn1.addActionListener(this);
      btn2.addActionListener(this);
   }
   public static void main(String[] args) {
      Quiz2 q=new Quiz2();
      q.setTitle("quiz2");
      q.setSize(400,400);
      q.setVisible(true);
      q.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      String command=e.getActionCommand();
      File memoFile=new File("c:/text/memo.txt");
      if(command.equals("입력")) {
         try {
            String tft=tf.getText();
            FileWriter fw=new FileWriter(memoFile, true);
            fw.append(tft);
            fw.close();
         } catch (IOException e1) {
            e1.printStackTrace();
      }}else if(command.equals("불러오기")) {
         try {
            FileReader fr=new FileReader(memoFile);
            BufferedReader br=new BufferedReader(fr);
            while(true) {
               String line=br.readLine();
               if(line==null)break;
               ta.setText(line);
            }
         } catch (IOException e1) {
            e1.printStackTrace();
         }
      }
   }
}