import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CheckboxGroup extends Applet implements ItemListener
{
	Checkbox cbmale,cbfemale;
	String msg=" ",str;
	Label Lgender;
	CheckboxGroup cbg;
	
	public void init()
	{
		Lgender=new Label("gender");
		cbg=new CheckboxGroup();
		cbmale=new Checkbox("male",true);
		cbfemale=new Checkbox("female");

		
		add(Lgender);
		add(cbmale);
		add(cbfemale);
		
		//register event
		cbmale.addItemListener(this);
		cbfemale.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg="Current state:";
		g.drawString(msg,10,20);
		msg+=cbg.getSelctedCheckbox().getLabel();
		g.drawString(msg,20,60);
			 
		
	}
}
		
		