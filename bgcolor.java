import java.awt.*;
import java.awt.event.*;
public class bgcolor extends Frame implements ItemListener
{
CheckboxGroup cg;
Checkbox c1,c2,c3,c4,c5,c6,c7;
bgcolor()
{
cg=new CheckboxGroup();
c1=new Checkbox("About us",cg,true);
c2=new Checkbox("Bikes",cg,false);
c3=new Checkbox("Scooters",cg,false);
c4=new Checkbox("Images",cg,false);
c5=new Checkbox("EMI Plans",cg,false);
c6=new Checkbox("Customer care",cg,false);
c7=new Checkbox("Help",cg,false);
add(c1);
add(c2);
add(c3);
add(c4);
add(c5);
add(c6);
add(c7);
c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
c4.addItemListener(this);
c5.addItemListener(this);
c6.addItemListener(this);
c7.addItemListener(this);
setSize(600,500);
setLayout(new FlowLayout( ));
setVisible(true);
}
public void itemStateChanged(ItemEvent i)
{
Color c;
if(i.getSource()==c1)
{
setBackground(Color.red);
}
else if(i.getSource()==c2)
{
c=new Color(200,50,170);
setBackground(c);
}
else if(i.getSource()==c3)
{
setBackground(Color.blue);
}
else if(i.getSource()==c4)
{
setBackground(Color.green);
}
else if(i.getSource()==c5)
{
c=new Color(75,0,130);
setBackground(c);
}
else if(i.getSource()==c6)
{
setBackground(Color.orange);
}
else if(i.getSource()==c7)
{
setBackground(Color.yellow);
}
}
public static void main(String args[])
{
new bgcolor();
}
}
