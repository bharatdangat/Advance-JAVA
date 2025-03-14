import javax.swing.*;
public class JTableDemo2 extends JFrame 
{
	JTable tbl;
	JTableDemo2()
	  {
		  setVisible(true);
		  setSize(500,500);
		  setLayout(null);
		  String head[]={"Rolll No","Name","Per"};
		  String data[][]={{"1","adi","90"},{"2","abhi","89"},{"3","aman","79"}};
		  tbl=new JTable(data,head);
		  JScrollPane jsp=new JScrollPane(tbl);
		  jsp.setBounds(100, 100, 300, 100);
		  add(jsp);
	  }
 public static void main(String[] args) 
 {
  new JTableDemo2();
 }
}
