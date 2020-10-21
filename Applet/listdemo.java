import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class listdemo extends Applet implements ItemListener
{
	List lsub;
	String msg=" ";
	public void init()
	{
		lsub=new List(5,false);
		lsub.add("jp2");
		lsub.add("jsp");
		lsub.add("android");
		lsub.add("ST");
		lsub.add("CS");
		
		add(lsub);
		
		lsub.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="current state:";
		msg="Selected subject: "+lsub.getSelectedItem();
		
		g.drawString(msg,50,100);
	}
}