import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class LabelDemo extends Applet 
{
	Label one,two,three;
	public void init()
	{
		one=new Label("one",Label.RIGHT);
		two=new Label("two",Label.LEFT);
		three=new Label("three");
	
	//add label to appet window
		add(one);
		add(two);
		add(three);
	}
}