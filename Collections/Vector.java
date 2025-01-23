import javax.swing.*;

import java.util.*;
public class Vector extends JFrame 
{
	JTable tbl;
	Vector()
	{
		setVisible(true);
		setSize(400,400);
		setLayout(null);
	   Vector cols=new Vector();
	   cols.add("Roll No");
	   cols.add("Name");
	   cols.add("Per");
	   Vector data=new Vector();
	   Vector row1=new Vector();
	   row1.add("101");
	   row1.add("om");
	   row1.add("90");
	   Vector row2=new Vector();
	   row1.add("102");
	   row1.add("sai");
	   row1.add("20");
	   data.add(row1);
	   data.add(row2);
	JScrollPane jsp=new JScrollPane(tbl);
	jsp.setBounds(100,100,200,200);
	add(jsp);
	}
	
	private void add(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) 
	{
	new Vector();
	}

}
