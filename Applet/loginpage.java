import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class loginpage extends Applet implements ActionListener
{
	String uname,pass,msg;
	TextField tusername,tpassword,tage;
	Button login;
	Label username,password,age,email,gender;
	public void init()
	{
		username=new Label("user name");
		password=new Label("password");
		age=new Label("Age");
		email=new Label("email");
		tusername=new TextField(20);
		tpassword=new TextField(20);
		tage=new TextField(20);
		login=new Button("login");
		add(username);
		add(tusername);
		add(password);
		add(tpassword);
		add(age);
		add(tage);

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