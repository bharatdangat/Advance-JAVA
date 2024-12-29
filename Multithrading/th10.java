//create Thread and performed method start(),stop()  using GUI.......
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener,Runnable
{
  Thread th;//Thread declare globally not in constructor becoz it use outside const          
  TextField t1;
  Button b1,b2;
  Demo()
  {
    th=new Thread(this);
     setVisible(true);
     setSize(500,500);
     setLayout(new FlowLayout());
     t1=new TextField(10);
    b1=new Button("Start");
     b2=new Button("Stop");
    add(t1); add(b1); add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
           if(ae.getSource()==b1)
           {
                    th.start();
           }
           if(ae.getSource()==b2)
           {
                    th.stop();
           }
    }
    public void run()
    {
        try
    {
        for(int i=1;i<=50;i++)
        {
              th.sleep(1000);
              t1.setText(""+i);
         }
    }catch(Exception e){}
    }
  
  public static void main(String arg[])
  {
    new Demo();
  }
}


