import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class loginpage1 extends Applet implements ActionListener
{
	String uname,pass,msg;
	TextField tusername,tpassword,tage,temail;
	Button login;
	Label lusername,lpassword,lage,lemail;
	public void init()
	{
		lusername=new Label("user name:");
		lpassword=new Label("password:");
		lage=new Label("Age:");
		lemail=new Label("Email");
		
		tusername=new TextField(20);
		tpassword=new TextField(20);
		tage=new TextField(20);
		temail=new TextField(20);
		login=new Button("login");
		
		add(lusername);
		add(tusername);
		
		add(lpassword);
		add(tpassword);
		
		add(lage);
		add(tage);
		
		add(lemail);
		add(temail);
		
		add(login);
		login.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		uname=tusername.getText();
		pass=tpassword.getText();
		if(uname.equals("niraj") && pass.equals("rasal"))
 	    {
			msg="wecome sir";
		}
		else
		{
			msg="invaid ogin";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,60,90);
	}
}