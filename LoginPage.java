import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class LoginPage extends Applet implements ActionListener
{
	String msg;
	Label Luname,Lupass;
	TextField tuname,tupass;
	Button blogin;
	public void init()
	{
		Luname=new Label("User Name");
		Lupass=new Label("Password");
		tuname=new TextField(20);
		tupass=new TextField(20);
		blogin=new Button("Login");
		tupass.setEchoChar('*');
		add(Luname);
		add(tuname);
		add(Lupass);
		add(tupass);
		add(blogin);
		blogin.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="your name is: "+tuname.getText()+" password is "+tupass.getText();
		g.drawString(msg,80,90);
	}
}