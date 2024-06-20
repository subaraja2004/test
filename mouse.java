import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*<applet code="mouse.class" width="700" height="700">
</applet>*/
public class mouse extends Applet implements MouseListener,KeyListener
{
String s,w;
String p="Mouse and Keyboard Handling";
public void init()
{
setForeground(Color.blue);
addKeyListener(this);
addMouseListener(this);
}
public void mouseClicked(MouseEvent e)
{
s="Mouse Clicked";
repaint();
}
public void mousePressed(MouseEvent e)
{
s="Mouse Pressed";
repaint();
}
public void mouseExited(MouseEvent e)
{
s="Mouse Exited";
repaint();
}
public void mouseEntered(MouseEvent e)
{
s="Mouse Entered";
repaint();
}
public void mouseReleased(MouseEvent e)
{
s="Mouse Released";
repaint();
}
public void keyPressed(KeyEvent k)
{
w="Key pressed";
repaint();
}
public void keyReleased(KeyEvent k)
{
w="Key Released";
repaint();
}
public void keyTyped(KeyEvent k)
{
w="Key Typed";
repaint();
}
public void paint(Graphics g)
{
Font f=new Font("Arial",Font.BOLD,32);
g.setFont(f);
g.drawString(p,200,100);
g.drawString(s,200,300);
g.drawString(w,200,400);
}
}
