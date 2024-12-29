package ty25;
import javax.swing.*;
public class GUI2 extends JFrame
{
	JTable tbl;
GUI2()
{
 setVisible(true);
 setSize(50000);
 setLayout(null);
 String cols[]={"Roll No ","Name","Per"};
 String data[][]={{"1","om","90"},{"2","sai","97"},{"3","ram","67"}};
 tbl=new JTable(data,cols);
 tbl.setBounds(100,100,400,300);
 add(tbl);
}

	public static void main(String[] args)
	{
	new GUI2();
	}

}
