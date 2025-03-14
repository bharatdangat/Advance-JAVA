import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class JTableDemo4 extends JFrame  
{ 
   Label l1;
   Choice c1;
   Connection con;
   Statement st;
   ResultSet rs;
   JTableDemo4() 
   {
	setVisible(true);
	setSize(500,500);
	setLayout(null);
	l1=new Label("Select Course-");
	c1=new Choice();
	try
	{
		Class.forName("org.postgresql.Driver");
		 con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
		 st=con.createStatement();
		 rs=st.executeQuery("select * from Course");
		 while(rs.next())
		 {
			 c1.add(""+rs.getString(2));
		 }
		
	}catch(Exception e)
	{
		JOptionPane.showInternalMessageDialog(this,e);
	}
	add(c1);
	l1.setBounds(70, 60,100, 100);
	c1.setBounds(200, 100, 300,500);
   }
	public static void main(String[] args) 
	{
	 new JTableDemo4();
	}

}
