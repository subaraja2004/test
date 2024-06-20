import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="cal.java" width="300" height="300">
</applet>
*/
public class cal extends Applet implements ActionListener
{
TextField t;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
Panel p;
String msg="",tmp;
int a,b;
public void init()
{
t=new TextField();
setLayout(new BorderLayout());
add(t,"North");
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
b5=new Button("5");
b6=new Button("6");
b7=new Button("7");
b8=new Button("8");
b9=new Button("9");
b10=new Button("0");
b11=new Button("+");
b12=new Button("-");
b13=new Button("*");
b14=new Button("/");
b15=new Button("clear");
b16=new Button("=");
p=new Panel();
add(p);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(b10);
p.add(b11);
p.add(b12);
p.add(b13);
p.add(b14);
p.add(b15);
p.add(b16);
p.setLayout(new GridLayout(4,4));
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String str=e.getActionCommand();
if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/"))
{
String str1=t.getText();
tmp=str;
a=Integer.parseInt(str1);
msg="";
}
else if (str.equals("="))
{
String str2=t.getText();
b=Integer.parseInt(str2);
int sum=0;
if(tmp=="+")
sum=a+b;
else if(tmp=="-")
sum=a-b;
else if(tmp=="*")
sum=a*b;
else if(tmp=="/")
sum=a/b;
String str1=String.valueOf(sum);
t.setText(""+str1);
msg="";
}
else if(str.equals("clear"))
{
t.setText("");
msg="";
}
else
{
msg+=str;
t.setText(""+msg);
}
}
}
