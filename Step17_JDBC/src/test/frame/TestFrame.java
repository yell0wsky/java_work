package test.frame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/*
 *  //1. 선택된 row  인덱스를 읽어온다.
   int selectedIndex=table.getSelectedRow();
   
   //2. 선택된 row 의 첫번째(0번째) 칼럼의 숫자를 읽어온다 (삭제할 회원의 번호)
   int num=(int)model.getValueAt(selectedIndex, 0);
   
   
   -------------------------------------
   
   List<MemberDto>  list=dao.getList();
   
   for(MemberDto tmp:list){
      Object[] row={tmp.getNum(), tmp.getName(), tmp.getAddr()};
      model.addRow(row);
   }
 * 
 */
public class TestFrame extends JFrame{
   //필드
   JTextField inputName, inputAddr;
   DefaultTableModel model;
   JTable table;
   
   //생성자
   public TestFrame() {
      setLayout(new BorderLayout());
      
      JLabel label1=new JLabel("이름");
      inputName=new JTextField(10);
      
      JLabel label2=new JLabel("주소");
      inputAddr=new JTextField(10);
      
      JButton saveBtn=new JButton("저장");
      saveBtn.setActionCommand("save");
      
      //삭제 버튼 추가
      JButton deleteBtn=new JButton("삭제");
      deleteBtn.setActionCommand("delete");
      
      JPanel panel=new JPanel();
      panel.add(label1);
      panel.add(inputName);
      panel.add(label2);
      panel.add(inputAddr);
      panel.add(saveBtn);
      panel.add(deleteBtn);
      
      add(panel, BorderLayout.NORTH);
      
      //표형식으로 정보를 출력하기 위한 JTable
      table=new JTable();
      //칼럼명을 String[] 에 순서대로 준비
      String[] colNames= {"번호", "이름", "주소"};
      //테이블에 출력할 정보를 가지고 있는 모델 객체 (칼럼명, row 갯수)
      model=new DefaultTableModel(colNames, 0);
      //모델을 테이블에 연결한다.
      table.setModel(model);
      //스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
      JScrollPane scroll=new JScrollPane(table);
      //JScrollPane  을 프레임의 가운데에 배치하기 
      add(scroll, BorderLayout.CENTER);
      
      displayMember();
   }
   
   //테이블에 데이터 출력하는 메소드
   public void displayMember() {
      
      //model.setRowCount(0); //테이블에 출력된 데이터 reset 
      
      Object[] row1= {1, "김구라", "노량진"};
      model.addRow(row1);
      
      Object[] row2= {2, "해골", "행신동"};
      model.addRow(row2);
      
      Object[] row3= {3, "원숭이", "상도동"};
      model.addRow(row3);
      
   }
   
   
   //main  메소드
   public static void main(String[] args) {
      TestFrame f=new TestFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 800, 500);
      f.setVisible(true);
   }
}