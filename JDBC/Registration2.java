import java.util.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Registration2 extends JFrame implements ActionListener
{
   JLabel l1,l2,l3,l4,l5,l6,l7,l8;
   JTextField t1,t2;
   JComboBox c1,c2;
   JRadioButton ca1,ca2,ca3,ca4,ca5,ca6,ca7,ca8;
   ButtonGroup cg1,cg2,cg3;
    JButton b1,b2,b3,b4,b5;
    JRadioButton r6,r7,r8;
   Connection con;
   PreparedStatement pst;
    Registration2() 
    {
	 setVisible(true);
	 setSize(500,500);
	 setLayout(null);
	 
	 l1=new JLabel("Co-Win Registration");
	 l2=new JLabel("Adhar Card No-");
	 l3=new JLabel("Birth Year");
	 l4=new JLabel("Mobile No");
	 l5=new JLabel("Age Group");
	 l6=new JLabel("Select Hospital");
	 l7=new JLabel("Vaccines");
	 l8=new JLabel("Time Slot");
	 
	 t1=new JTextField(20);
	 t2=new JTextField(15);
	 String s1[]={"2001","2002","2003"};
	 c1=new JComboBox(s1);
	 String s2[]={"S K Hospital","A.R Hospital","City Hospital"};
	 c2=new JComboBox(s2);
	 b1=new JButton("Add");
	 b2=new JButton("Update");
	 b3=new JButton("Delete");
	 b4=new JButton("View");
	 b5=new JButton("Search");
	 
     cg1=new ButtonGroup();
     ca1=new JRadioButton("18&Above");
     ca2=new JRadioButton("45&Above");
     
     cg2=new ButtonGroup();
     ca3=new JRadioButton("Covishild");
     ca4=new JRadioButton("Covaxine");
     ca5=new JRadioButton("Sputnik-V");
     
     cg3=new ButtonGroup();
     ca6=new JRadioButton("Morning");
     ca7=new JRadioButton("Aternoon");
     ca8=new JRadioButton("Evening");
     
	l1.setBounds(240,40,400,30);
	l2.setBounds(50,80,120,50);
    t1.setBounds(200,90,200,30);
    l3.setBounds(50,140,100,30);
    c1.setBounds(200,140,100,30);
    l4.setBounds(50,200,100,30);
    t2.setBounds(200,195,200,30);
    l5.setBounds(50,260,100,30);
    ca1.setBounds(200,250,150,30);
    ca2.setBounds(400,250,200,30);
    l6.setBounds(50,300,150,50);
    c2.setBounds(200,310,100,30);
    l7.setBounds(50,370,90,30);
    ca3.setBounds(200,370,100,30);
    ca4.setBounds(300,370,100,30);
    ca5.setBounds(400,370,100,30);
    l8.setBounds(50,390,150,50);
    ca6.setBounds(200,400,100,30);
    ca7.setBounds(300,400,100,30);
    ca8.setBounds(400,400,100,30);
    b1.setBounds(100,500,100,50);
    b2.setBounds(250,500,100,50);
    b3.setBounds(450,500,100,50);
    b4.setBounds(650,500,100,50);
    b5.setBounds(850,500,100,50);
	
    add(l1); 
	 add(l2); add(t1);
	 add(l3);
	 add(c1);
	 add(l4); add(t2);
	 add(l5); cg1.add(ca1); cg1.add(ca2);
	              add(ca1);      add(ca2);
	 add(l6); 
	 add(c2);
     add(l7); cg2.add(ca3); cg2.add(ca4); cg2.add(ca5);
                  add(ca3);    add(ca4);      add(ca5);
     add(l8); cg3.add(ca6); cg3.add(ca7); cg3.add(ca8);
                  add(ca6);     add(ca7);      add(ca8);
     add(b1); add(b2); add(b3); add(b4); add(b5);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
    try
    {
     Class.forName("org.postgresql.Driver");
     con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");   
     
     String adhar=t1.getText();
	 String birth=(String)c1.getSelectedItem();
	 String mobile=t2.getText();
	 String hospital=(String)c2.getSelectedItem();
	 String age="NotSelected";
	 if(ca1.isSelected())
	 {
	    age=ca1.getText();
	 }
	 else if(ca2.isSelected())
	 {
	   age=ca2.getText();
	 }
	 String vaccine="Not Selected";
	  if(ca3.isSelected())
	 {
		  vaccine=ca3.getText();
	 }
	 else if(ca4.isSelected())
	 {
		  vaccine=ca4.getText();
	 }
	 else if(ca5.isSelected())
	 {
		  vaccine=ca5.getText();
	 }
	String time=ca6.isSelected()?ca6.getText():ca7.isSelected()?ca7.getText():ca8.isSelected()?ca8.getText():"Not Selected";
	


     if(ae.getSource()==b1)
     {
    	String q="insert into Registration values(?,?,?,?,?,?,?)";
    	PreparedStatement pst=con.prepareStatement(q);
    	pst.setString(1,adhar);
    	pst.setString(2,birth);
    	pst.setString(3,mobile);
    	pst.setString(4,age);
    	pst.setString(5,hospital);
    	pst.setString(6,vaccine);
    	pst.setString(7,time);
    	pst.executeUpdate();
    	JOptionPane.showMessageDialog(this,"Record Inserted.........");
     }
     if(ae.getSource()==b2)
     {
    	 String q="update Registration set mno=? where ano=?";
     	PreparedStatement pst=con.prepareStatement(q);
     	pst.setString(1,mobile);
     	pst.setString(2,adhar);
     	pst.executeUpdate();
    	JOptionPane.showMessageDialog(this,"Record Updated.........");
     	
     }
     if(ae.getSource()==b3)
     {
    	 String q="delete from Registration where vaccine=?";
      	PreparedStatement pst=con.prepareStatement(q);
      	pst.setString(1,vaccine);
      pst.executeUpdate();
     	JOptionPane.showMessageDialog(this,"Record Deleted.........");
      	
     }
     if(ae.getSource()==b4)
     {
      Vector head=new Vector();
      head.add("Adhar Card No");
      head.add("Birth Year");
      head.add("Mobile No");
      head.add("Age Group");
      head.add("Hospital");
      head.add("Vaccine");
      head.add("Time Slot");
      
      Vector data=new Vector();
      try
      {
    	  String q="select * from Registration";
    	  pst=con.prepareStatement(q);
    	  ResultSet rs=pst.executeQuery();
    	  while(rs.next())
    	  {
    		  Vector row1=new Vector();
    		  row1.add(rs.getString("ano"));
    		  row1.add(rs.getString("byear"));
    		  row1.add(rs.getString("mno"));
    		  row1.add(rs.getString("age"));
    		  row1.add(rs.getString("hospital"));
    		  row1.add(rs.getString("vaccine"));
    		  row1.add(rs.getString("time"));
    		  data.add(row1);
    	  }
    	  JTable tbl=new JTable(data,head);
    	  JScrollPane jsp=new JScrollPane(tbl);
    	  jsp.setBounds(50,550,1000,200);
    	  add(jsp);
      }catch(Exception e)
      {
    	  System.out.println(e);
      }
    	 
     }
     if(ae.getSource()==b5)
     {
    	 int flag=0;
    	 String q="select * from Registration";
      	PreparedStatement pst=con.prepareStatement(q);
      	ResultSet rs=pst.executeQuery();
      	while(rs.next())
      	{
      	  String s1=rs.getString("ano");
      	  if(s1.equals(adhar))
      	  {
      	   flag=1;
      	  }
      	}
      	
      	if(flag==1)
      	{
     	JOptionPane.showMessageDialog(this,"Record is Found");
     	}
      	else
      	{
      		JOptionPane.showMessageDialog(this,"Record Not Found");
          		
      	}
      		
      		
     }
    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
    
	public static void main(String[] args) 
	{
	 new Registration2();
	}

}
