import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class RegistrationForm extends Applet implements ActionListener
{
	Label flabel,mlabel,llabel,sclabel,molabel,emaillabel,lstate,ladd;
	TextField fname,mname,lname,mono,email;
	Choice csub;
	List stalist;
	Button lbutton;
	String struname,strmname,strlname,msg,msg1,mno,emstr,add,textstr;
	GridLayout gd=new GridLayout();
	public void init()
	{
		flabel=new Label("First Name:");
		fname=new TextField(10);
		mlabel=new Label("Middle Name:");
		mname=new TextField(10);
		llabel=new Label("Last Name:");
		lname=new TextField(10);
		
		molabel=new Label("Mobile.No:");
		mono=new TextField(10);
		emaillabel=new Label("Email:");
		email=new TextField(10);
		ladd=new Label("Address:");
		TextArea text=new TextArea(10,30);
		
		sclabel=new Label("City:");
		csub=new Choice();
		csub.add("Pune");
		csub.add("Mumbai");
		csub.add("Nagpur");
		csub.add("Sangamner");
		csub.add("latur");
		
		lstate=new Label("Subject:");
		stalist=new List(5,true);
		stalist.add("java Programming 2");
		stalist.add("Java Server Page");
		stalist.add("Android");
		stalist.add("computer Security");
		stalist.add("Software Testing");
	
		lbutton=new Button("Submit");
		
		add(flabel);
		add(fname);
		add(mlabel);
		add(mname);
		add(llabel);
		add(lname);
		add(molabel);
		add(mono);
		add(emaillabel);
		add(email);
		add(ladd);
		add(text);
		add(sclabel);
		add(csub);
		add(lstate);
		add(stalist);
		add(lbutton);
		
		lbutton.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		struname=fname.getText();
		strmname=mname.getText();
		strlname=lname.getText();
		mno=mono.getText();
		emstr=email.getText();
		//textstr=text.getText();
		if(struname.equals("shubham") && strmname.equals("dattatray") && strlname.equals("patil"))
		{
			msg1="login Successfully...........";
			msg="Name : "+struname+" "+strmname+" "+strlname;
		}
		else
		{
			msg=" Invalid login ";
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg1,60,280);
		g.drawString(msg,60,300);
		g.drawString("Mobile No : "+mno,60,320);
		g.drawString("Email : "+emstr,60,340);
		//g.drawString("Address: "+textstr,60,360);
	}
}