/*create table project insert into project values in table and then display projrct details in tabular format use swing(we use JTable......)
 */
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
public class Project extends JFrame 
{
 Connection con;
 Statement st;
 ResultSet rs;
 JTable tbl;
 Vector data,head;
 Project()
 {
	 setVisible(true);
	 setSize(400,400);
	 setLayout(null);
	 head=new Vector();
	 head.add("Project Id");
	 head.add("Project Name");
	 head.add("Project Description");
	 head.add("Project Status");
	 data=new Vector();
	 
	 try
	 {
		 Class.forName("org.postgresql.Driver");
		 con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
		 st=con.createStatement();
		 rs=st.executeQuery("select * from Project");
		 while(rs.next())
		 {
			 Vector row1=new Vector();
			 row1.add(rs.getInt(1));
			 row1.add(rs.getString(2));
			 row1.add(rs.getString(3));
			 row1.add(rs.getString(4));
			 data.add(row1);
		 }
		 
		 tbl=new JTable(data,head);
		 JScrollPane jsp=new JScrollPane(tbl);
		 jsp.setBounds(100,100,1000,1000);
		 add(jsp);
	 }catch(Exception e)
	 {
		 JOptionPane.showMessageDialog(this,e);
	 }
 }
 
 public static void main(String[] args) 
 {
 new Project(); 
 }

}
