import java.awt.*;
import java.awt.event.*;
public class menueg extends Frame implements ActionListener
{
MenuBar mb;
Menu m1,m2;
MenuItem o1,o2,o3,o4,o5,o6;
TextArea t;
String s;
menueg()
{
t=new TextArea();
add(t);
mb=new MenuBar();
setMenuBar(mb);
m1=new Menu("File");
mb.add(m1);
m2=new Menu("Edit");
mb.add(m2);
o1=new MenuItem("New");
m1.add(o1);
o2=new MenuItem("Save");
m1.add(o2);
o3=new MenuItem("close");
m1.add(o3);
o4=new MenuItem("Cut");
m2.add(o4);
o5=new MenuItem("Copy");
m2.add(o5);
o6=new MenuItem("paste");
m2.add(o6);
o1.addActionListener(this);
o2.addActionListener(this);
o3.addActionListener(this);
o4.addActionListener(this);
o5.addActionListener(this);
o6.addActionListener(this);
setSize(500,500);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{ System.exit(0); }
});
}
public void actionPerformed(ActionEvent r)
{
if(r.getSource()==o1)
{
t.setText("File Created");
}
else if(r.getSource()==o2)
{
t.setText("File Saved");
}
else if(r.getSource()==o3)
{
System.exit(0);
}
else if(r.getSource()==o4)
{
s=t.getSelectedText();
t.replaceRange(" ",t.getSelectionStart(),t.getSelectionEnd());
}
else if(r.getSource()==o5)
{
s=t.getSelectedText();
}
else if(r.getSource()==o6)
{
t.replaceRange(s,t.getSelectionStart(),t.getSelectionEnd());
}
}
public static void main(String arg[])
{
new menueg();
}
}
