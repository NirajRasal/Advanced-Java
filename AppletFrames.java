import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class framedemo extends Frame
{
	framedemo(String titel)
	{
		super(titel);
	}
	public void paint(Graphics g)
	{
		g.drawString("frame window",10,40);
	}
}
public class AppletFrames extends Applet
{
Frame f;
public void init()
{
f=new framedemo("Frame example");
f.setSize(100,100);
f.setVisible(true);
}

public void paint(Graphics g)
{
g.drawString("this is applet window",10,20);
}
}	