//create Thread and performed method start(),stop() using GUI.......
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener,Runnable
{
  Thread th;          
  TextField t1;
  Button b1,b2;
  Demo()
  {
    th=new Thread(this);
    th.start();
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
                    th.resume();
           }
           if(ae.getSource()==b2)
           {
                    th.suspend();
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


