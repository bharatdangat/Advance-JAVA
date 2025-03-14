import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import java.lang.Integer;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class JTableDemo5 extends JFrame implements ItemListener,ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	Choice c1;
	JButton b1,b2,b3;
	JTable tbl;
	Connection con;
	Statement st;
	ResultSet rs;
    JTableDemo5() 
    {
	 setVisible(true);
	 setSize(500,500);
	 setLayout(null);
	 
	 l1=new JLabel("Select Course");
	 c1=new Choice();
	 l2=new JLabel("Enter Student Id");
	 l3=new JLabel("Enter Student Name");
	 l4=new JLabel("Enter Student Class");
	 t1=new JTextField(20);
	 t2=new JTextField(20);
	 t3=new JTextField(20);
	 
	 b1=new JButton("Add Student");
	 b2=new JButton("Delete Student");
	 b3=new JButton("Show All Student");
	 
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
	 add(l1);
	 add(c1);
	 }catch(Exception e)
	 {
		 JOptionPane.showMessageDialog(this,e);
	 }
	 add(c1);
	 l1.setBounds(70, 70, 100, 100);
	 c1.setBounds(200,110,200,200);
	 c1.addItemListener(this);
	 
	 add(l2); add(l3); add(l4);
	 add(t1);  add(t2);  add(t3);
    add(b1); add(b2); add(b3);
    b1.setBounds(200,140,180,25);
    b2.setBounds(400,140,180,25);
    b3.setBounds(600,140,180,25);
    l2.setBounds(70,1,200,50);
    l3.setBounds(70,30,200,50);
    l4.setBounds(70,60,200,50);
    t1.setBounds(190, 15, 100,20);
    t2.setBounds(190,45 , 100,20);
    t3.setBounds(190, 75, 100,20);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    }
  @Override
    public void itemStateChanged(ItemEvent is) 
  {
   if(is.getSource()==c1)
   {
	     Vector head=new Vector();
		 head.add("Student Id");
		 head.add("Student Name");
		 head.add("Student Class");
		
		 Vector data=new Vector();
		 try
		 {
			
			   String cn=c1.getSelectedItem().toString();
			   String query="select * from Student,Course,CS where Student.studentid=CS.studentid and Course.courceid=CS.courseid and coursename='"+cn+"'";
			   rs=st.executeQuery(query);
			   while(rs.next())
			   {
				   Vector row1=new Vector();
				   row1.add(rs.getInt(1));
				   row1.add(rs.getString(2));
				   row1.add(rs.getString(3));
				   data.add(row1);
			   }
			   tbl=new JTable(data,head);
			   JScrollPane jsp=new JScrollPane(tbl);
			   jsp.setBounds(100,200, 500, 200);
			   add(jsp);
	    }catch(Exception e)
		 {
	    	JOptionPane.showMessageDialog(this,e);
		 }
   }
   }
  @Override
    public void actionPerformed(ActionEvent ae )
  {
	if(ae.getSource()==b1)
	{
		 try
		 {
			 String s1=t1.getText();
			 int no=Integer.parseInt(s1);
			 String nm=t2.getText();
			 String cl=t3.getText();
			 String query="insert into Student values("+no+",'"+nm+"','"+cl+"')";			 
			 st.executeUpdate(query);
			 JOptionPane.showMessageDialog(this,"Record Inserted");
	    }catch(Exception e)
		 {
	    	JOptionPane.showMessageDialog(this,e);
		 }	
	 
	}
	else if(ae.getSource()==b2)
	{
		try
		 {
			 String s1=t1.getText();
			 int no=Integer.parseInt(s1);
			 String query1="delete from CS where studentid="+no;
			 String query2="delete from Student where studentid="+no;
			 st.executeUpdate(query1);
			 st.executeUpdate(query2);
			 JOptionPane.showMessageDialog(this,"Record Deleted");
	    }catch(Exception e)
		 {
	    	JOptionPane.showMessageDialog(this,e);
		 }	
	 	
	}
	else if(ae.getSource()==b3)
		{
		Vector head=new Vector();
		 head.add("Student Id");
		 head.add("Student Name");
		 head.add("Student Class");
		
		 Vector data=new Vector();
		 try
		 {
			   String query="select * from Student";
			   rs=st.executeQuery(query);
			   while(rs.next())
			   {
				   Vector row1=new Vector();
				   row1.add(rs.getInt(1));
				   row1.add(rs.getString(2));
				   row1.add(rs.getString(3));
				   data.add(row1);
			   }
			    
			   JTable tbl=new JTable(data,head);
			   JScrollPane jsp=new JScrollPane(tbl);
			   jsp.setBounds(100,200, 500, 200);
			   add(jsp);
	    }catch(Exception e)
		 {
	    	JOptionPane.showMessageDialog(this,e);
		 }
  
		}
		
	
}
	public static void main(String[] args) 
	{
	new JTableDemo5();
	}

}
