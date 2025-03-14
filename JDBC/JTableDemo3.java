import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JTableDemo3 extends JFrame 
{
	JTable tbl;
	JTableDemo3()
	  {
		  setVisible(true);
		  setSize(500,500);
		  setLayout(null);
		  
		 Vector head=new Vector();
		  head.add("Emp No");
		  head.add("Emp Name");
		  head.add("Emp Salary");
		
		  Vector data=new Vector();
		  
		  Vector row1=new Vector();
		  row1.add("101");
		  row1.add("om");
		  row1.add("90");
		  Vector row2=new Vector();
		  row2.add("102");
		  row2.add("sai");
		  row2.add("60");
		  Vector row3=new Vector();
		  row3.add("103");
		  row3.add("ram");
		  row3.add("99");
		  data.add(row1);
		  data.add(row2);
		  data.add(row3);
		  
		  tbl=new JTable(data,head);
		  JScrollPane jsp=new JScrollPane(tbl);
		  jsp.setBounds(100, 100, 300, 100);
		  add(jsp);
	  }
 public static void main(String[] args) 
 {
  new JTableDemo3();
 }
}
