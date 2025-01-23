import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends Frame implements ActionListener 
{
 Label l1,l2,l3;
 TextField t1,t2;
 TextArea t3;
 Button b1,b2,b3;
 TreeMap<String,String>t=new TreeMap<String,String>();
 GUI()
 {
  setVisible(true);
  setSize(500,500);
  setLayout(new FlowLayout());
  l1=new Label("Enter City Name");
  l2=new Label("Enter STD Code");
  l3=new Label("Result-");
  t1=new TextField(10);
  t2=new TextField(10);
  t3=new TextArea(10,50);
  b1=new Button("Add");
  b2=new Button("Remove");
  b3=new Button("Search");
  add(l1); add(t1); add(l2); add(t2); 
  add(b1); add(b2);add(b3);
  add(l3); add(t3);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae) 
 {
  if(ae.getSource()==b1)
  {
   String s1=t1.getText();
   String s2=t2.getText();
   t.put(s1, s2);
   t3.setText(t.toString());  
  }
  if(ae.getSource()==b2)
  {
  String s1=t1.getText();
  t.remove(s1);
  t3.setText(t.toString());
  }
  if(ae.getSource()==b3)
  {
	String s1=t1.getText();
	if(t.containsKey(s1))
	{
	Object ob=t.get(s1);
	 String s=ob.toString();
	 t3.setText("city Found.. STD code="+s);
	}
	else
	{
	t3.setText("Not Found..");	
	}
  }
 }
 public static void main(String[] args) 
 {
  new GUI();
 }
}
