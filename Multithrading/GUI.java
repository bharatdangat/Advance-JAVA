import java.awt.*;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
public class GUI extends Frame 
{
 Button b1,b2,b3;
 TextField t1;
GUI()
{
	setVisible(true);
	setSize(500,500);
	setLayout(new FlowLayout());
	b1=new Button("Red");
	b2=new Button("Yellow");
	b3=new Button("Green");
	t1=new TextField(20);
	add(b1); add(b2); add(b3);
	add(t1);
}
 public static void main(String[] args) 
 {
 new GUI();
 }

}
