import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class choicedemo extends Applet implements ItemListener
{
	Choice csub;
	String msg=" ";
	public void init()
	{
		csub=new Choice();
		csub.add("jp2");
		csub.add("jsp");
		csub.add("android");
		csub.add("ST");
		csub.add("CS");
		
		add(csub);
		
		csub.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Selected subject: "+csub.getSelectedItem();
		
		g.drawString(msg,50,100);
	}
}