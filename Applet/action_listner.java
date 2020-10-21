import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class action_listner extends Applet implements ActionListener
{
	String msg;
	Button bok,bcancel;
	public void init()
	{
	    bok=new Button("ok");
		bcancel=new Button("cancel");
		add(bok);
		add(bcancel);
		bok.addActionListener(this);
		bcancel.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str;
		str=ae.getActionCommand();
		if(str.equals("ok"))
		{
			msg="clicked on ok";
		}
	    else
		{
			msg="clicked on cancel";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}
}
	