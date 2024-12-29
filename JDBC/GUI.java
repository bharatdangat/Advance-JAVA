package ty25;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
public class GUI extends Frame implements ActionListener
{
 Label l1,l2,l3;
 TextField t1,t2,t3;
 Button b1,b2;
 Connection con;
 Statement st;
 GUI()
  {
	 try
	 {
	  Class.forName("org.postgresql.Driver");
	   con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	   st=con.createStatement();
	  setVisible(true);
	  setSize(500,500);
	  setLayout(new FlowLayout());
	   l1=new Label("Enter Roll No-");
	   l2=new Label("Enter Name-");
	   l3=new Label("Enter Per-");
	   t1=new TextField(10);
	   t2=new TextField(10);
	   t3=new TextField(10);
	   b1=new Button("Insert");
	   b2=new Button("Delete");
	   add(l1); add(t1);
	   add(l2); add(t2);
	   add(l3); add(t3);
	   add(b1); add(b2);
	   b1.addActionListener(this);
	  b2.addActionListener(this);
  }catch(Exception e){}
  }
  public void actionPerformed(ActionEvent ae)
  {
	  try
	  {
	   if(ae.getSource()==b1)
	   {
		  String s1=t1.getText();
		  int no=Integer.parseInt(s1);
		  String name=t2.getText();
		  String s3=t3.getText(); 
		  int per=Integer.parseInt(s3);
			int k= st.executeUpdate("insert into student values("+no+",'"+name+"',"+per+")"); 
	   System.out.println("value="+k);
		if(k>=1)
		   System.out.println("Record Inserted........");
	   }
	   if(ae.getSource()==b2)
	   {
		   String s1=t1.getText();
			  int no=Integer.parseInt(s1);
		int k=st.executeUpdate("delete from student where rno="+no);
		if(k>=1)
			System.out.println("Record Deleted....");
	   }
  }catch(Exception e){}
  }
	public static void main(String[] args) 
	{
		 new GUI();
	}
}
