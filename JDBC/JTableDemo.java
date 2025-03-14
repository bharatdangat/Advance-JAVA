import javax.swing.*;
public class JTableDemo extends JFrame 
{
   JTable tbl;
   public JTableDemo()
   {
    setVisible(true);
    setSize(500,500);
    setLayout(null);
    
    String head[]={"Roll No","Name","Per"};
    String data[][]={{"1","om","45"},{"2","sai","89"},{"3","ram","89"}};
    tbl=new JTable(data,head);
    JScrollPane jsp=new JScrollPane(tbl);
    jsp.setBounds(100, 100, 300, 100);
    add(jsp);
   }

 public static void main(String[] args) 
 {
  new JTableDemo();
 }

}
