import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CheckboxDemo extends Applet implements ItemListener
{
	Checkbox cbjp2,cbjsp,cbad,cbst,cbcs;
	String msg=" ";
	public void init()
	{
		cbjp2=new Checkbox("java programming-2");
		cbjsp=new Checkbox("java servlet programming");
		cbad=new  Checkbox("android");
		cbst=new  Checkbox("software testing");
		cbcs=new  Checkbox("computer secutity",true);
		
		add(cbjp2);
		add(cbjsp);
		add(cbad);
		add(cbst);
		add(cbcs);
		
		//register event
		cbjp2.addItemListener(this);
		cbjsp.addItemListener(this);
		cbad.addItemListener(this);
		cbst.addItemListener(this);
		cbcs.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Current state:";
		g.drawString(msg,10,50);
			 
		msg="java programming "+cbjp2.getState();
		g.drawString(msg,10,60);
		
		msg="java servet programming "+cbjsp.getState();
		g.drawString(msg,10,70);
		
		msg="android "+cbad.getState();
		g.drawString(msg,10,80);
		
		msg="software testing "+cbst.getState();
		g.drawString(msg,10,90);
		
		msg="computer security "+cbcs.getState();
		g.drawString(msg,10,100);
	}
}
		
		