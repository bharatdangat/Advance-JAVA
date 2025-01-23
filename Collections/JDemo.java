import javax.swing.*;
public class JDemo extends JFrame
{
	JTable tbl;
	JDemo()
	{
	 setVisible(true);
	 setSize(500,500);
	 setLayout(null);
    String cols[]={"Roll No","Name","Per"};
    String data[][]={{"1","om","90"},{"2","sai","30"},{"3","ram","50"}};
    tbl=new JTable(data,cols);
    JScrollPane jsp=new JScrollPane(tbl);
    jsp.setBounds(100,100,200,200);
    add(jsp);
	}
	public static void main(String[] args) 
	{
	new JDemo();
	}

}
