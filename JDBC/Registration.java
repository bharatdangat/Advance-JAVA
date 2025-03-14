import java.awt.*;
import javax.swing.*;
public class Registration extends JFrame 
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextField t1,t2;
    Choice c1,c2;
    Checkbox ca1,ca2,ca3,ca4,ca5,ca6,ca7,ca8;
    CheckboxGroup cg1,cg2,cg3;
    JButton b1,b2,b3,b4,b5;
    JRadioButton r6,r7,r8;
    Registration() 
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
	 c1=new Choice();
	 c2=new Choice();
	 b1=new JButton("Add");
	 b2=new JButton("Update");
	 b3=new JButton("Delete");
	 b4=new JButton("View");
	 b5=new JButton("Search");
	 
	 cg1=new CheckboxGroup();
	 ca1=new Checkbox("18 & Above",cg1,true);
	 ca2=new Checkbox("45 & Above",cg1,false);
	 
	 cg2=new CheckboxGroup();
	 ca3=new Checkbox("Covishild",cg2,true);
	 ca4=new Checkbox("Covaxine",cg2,false);
	 ca5=new Checkbox("Sputnik-V",cg2,false);
	 
	 cg3=new CheckboxGroup();
	 ca6=new Checkbox("Morning",cg3,true);
	 ca7=new Checkbox("Afternoon",cg3,false);
	 ca8=new Checkbox("Evening",cg3,false);
	 
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
	 c1.add("2001");
	 c1.add("2002");
	 c1.add("2003");
	 c1.add("2004");
	 c1.add("2005");
	 add(c1);
	 add(l4); add(t2);
	 add(l5); add(ca1); add(ca2);
	 add(l6); 
	 c2.add("S.K Hospital");
	 c2.add("A.R Hospital");
	 c2.add("City Hospital");
     add(c2);
     add(l7); add(ca3); add(ca4); add(ca5);
     add(l8); add(ca6); add(ca7); add(ca8);
     add(b1); add(b2); add(b3); add(b4); add(b5);
    
    
    }
	public static void main(String[] args) 
	{
	 new Registration();
	}

}
