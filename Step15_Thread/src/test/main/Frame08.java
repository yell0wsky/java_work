<<<<<<< HEAD
package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame08 extends JFrame implements ActionListener{
   JButton btn;
   JTextField inputMsg;
   
   public Frame08(String title) {
=======
public class Frame07 extends JFrame implements ActionListener{
   JButton btn;
   JTextField inputMsg;
   
   public Frame07(String title) {
>>>>>>> 082e9845352121d7df166b00a109b591c0064b90
      super(title);
      //레이아웃
      setLayout(new FlowLayout());
      inputMsg=new JTextField(10);
      btn= new JButton("구구단을 외자");
      
      add(inputMsg);
      add(btn);
      
      btn.addActionListener(this);
   }

   public static void main(String[] args) {
<<<<<<< HEAD
      JFrame f=new Frame08 ("나의 프레임");
=======
      JFrame f=new Frame07 ("나의 프레임");
>>>>>>> 082e9845352121d7df166b00a109b591c0064b90
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 500, 500);
      f.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      String strNum= inputMsg.getText();
      int num= Integer.parseInt(strNum);
      new Thread(new Runnable() {         
         @Override
         public void run() {
            int count=0;
            while (true) {
               try {
                  Thread.sleep(1000);
               } catch (Exception e2) {
                   e2.printStackTrace();
               }
               count++;
               System.out.println(num*count);
                     if(count==9) {
                         break;
                      }
            }
         
         }
      }).start();
      
   }
}