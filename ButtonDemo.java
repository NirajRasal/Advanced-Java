import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonDemo extends Applet implements ActionListener
{
	Button bok,bcancle;
	String msg="";
	public void init()
	{
		bok=new Button("ok");
		bcancle=new Button("cancle");
		add(bok);
		add(bcancle);
		bok.addActionListener(this);
		bcancle.addActionListener(this);
		setBackground(Color.black);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bok)
		{
			msg="clicked ok";
		}
		else if(e.getSource()==bcancle)
		{
			msg="clicked cancle";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,50,70);
	}
}