import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class arraybutton extends Applet implements ActionListener
{
	String msg;
	Button b[]=new Button[10];
	public void init()
	{
		for(int i=0;i<=9;i++)
		{
			b[i]=new Button(" "+i);
			add(b[i]);
			b[i].addActionListener(this);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		msg="you clicked"+str;
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,100);
	}
}