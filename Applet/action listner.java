import java.awt.*;
import java.applet.*;
class action listner extends applet implements ActionListener
{
	String msg;
	button bok,bcancel;
	public void init()
	{
		Button bok=new Button("ok");
		Button bcancel=new Button("cancel");
		bok.addActionListner(this);
		bocancel.addActionListner(this);
	}
	public void Action Perform(ActionEvent ae)
	{
		string str;
		str=ae.getActionCommand();
		if(str.equals("ok"))
		{
			msg="clicked on ok";
		}
	    else
		{
			msg="clicked on cancel";
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,50);
	}
}
	